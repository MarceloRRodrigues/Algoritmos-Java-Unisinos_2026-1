public class Exercicios
{
    public boolean exercicio1(int[] arrayInt, int n)
    {
        if(arrayInt == null) throw new IllegalArgumentException("Array não pode ser nulo.");

        int pos = 0;
        return exercicio1(arrayInt, n, pos);
    }
    private boolean exercicio1(int[] arrayInt, int n, int pos)
    {
        if(pos >= arrayInt.length) return false;

        if(arrayInt[pos] == n) return true;
        else return exercicio1(arrayInt, n, pos+1);
    }
}
