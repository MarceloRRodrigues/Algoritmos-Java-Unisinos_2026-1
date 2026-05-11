//Nome: Marcelo da Rosa Rodrigues

public class StaticList<E> implements List<E> {
    protected E[] elements;
    protected int numElements;
    public StaticList(int maxSize) {
        elements = (E[]) new Object[maxSize];
        numElements = 0;
    }
    public int numElements() {
        return numElements;
    }
    public boolean isEmpty() {
        return numElements == 0;
    }
    public boolean isFull() {
        return numElements == elements.length;
    }

    @Override
    public void insert(E element, int pos) throws OverflowException, IndexOutOfBoundsException
    {
        // verifica se há espaço na lista
        if (isFull())
            throw new OverflowException();

        // verifica se a posição é válida
        if (pos < 0  ||  pos > numElements)
            throw new IndexOutOfBoundsException();

        // desloca para a direita os elementos necessários,
        // abrindo espaço para o novo
        for (int i = numElements-1; i >= pos; i--)
            elements[i+1] = elements[i];

        // armazena o novo elemento e ajusta o total
        elements[pos] = element;
        numElements++;
    }

    @Override
    public E remove(int pos) throws UnderflowException, IndexOutOfBoundsException{
        if(isEmpty())
            throw new UnderflowException();

        // verifica se a posição é válida
        if (pos < 0  ||  pos >= numElements)
            throw new IndexOutOfBoundsException();

        // guarda uma refer�ncia temporária ao elemento removido
        E element = elements[pos];

        // desloca para a esquerda os elementos necessários,
        // sobrescrevendo a posição do que está sendo removido
        for (int i = pos; i < numElements-1; i++)
            elements[i] = elements[i+1];

        // define para null a posição antes ocupada pelo último,
        // para que a coleta de lixo possa atuar, e ajusta o total
        elements[numElements-1] = null;
        numElements--;

        return element;
    }

    @Override
    public E get(int pos) throws IndexOutOfBoundsException{
        // verifica se a posição é válida
        if (pos < 0  ||  pos >= numElements)
            throw new IndexOutOfBoundsException();

        return elements[pos];
    }

    @Override
    public int search(E element) {
        for (int i = 0; i < numElements; i++)
            if (element.equals(elements[i]))
                return i;

        // se chegar até aqui, é porque não encontrou
        return -1;
    }
    public E[] insertionSortCandidatos()
    {
        int cont = 0;
        System.out.print("\n\nComeçando Inserção ->\n\n");
        for(int i = 1; i < elements.length; i++) //percorre todos os elementos do seg. não ord.
        {
            Candidato chave = (Candidato) elements[i]; // Valor que será inserido na posição correta
            int j = i; // Índice usado para percorrer a parte ordenada

            // Move os candidatos com código maior que a chave uma posição à direita
            while (j > 0 && ((Candidato) (elements[j - 1])).getNumero() > chave.getNumero())
            {
                elements[j] = elements[j - 1];
                j--;
            }

            // Insere a chave na posição correta
            elements[j] = (E) chave;

            //Identifica qual é a iteração atual.
            cont++;
            System.out.printf("Iteração %d...\n", cont);

        }
        return elements;
    }
    public int pesquisaBinariaCandidatos(int numero)
    {
        System.out.print("\n\nIniciando Pesquisa Binária...");
        int inf = 0, sup = numElements-1;
        int media;

        while(inf <= sup)
        {
            media = (inf + sup) /2;
            System.out.printf("\nverificando a posição %d do array", media);

            if(numero < ((Candidato) (elements[media])).getNumero()) sup = media - 1;
            else if(numero > ((Candidato) (elements[media])).getNumero())  inf = media +1;
            else return media;
        }
        return -1;
    }

}
