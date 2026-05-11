public class BinarioParaDecimal
{
    public static void main(String[] args) {
        BinarioParaDecimal objeto = new BinarioParaDecimal();

        String binario = "00000110";

        int pos = 0; //posição será incrementada e deve começar em 0.

        try{
            System.out.print("O valor do número binário " + binario + " em decimal é = " + String.valueOf(objeto.Binario_Decimal(binario, pos)));

        }catch (ErroTamanhoNumBinario excecao){
            System.out.print(excecao.getMessage());
        }
    }
    public int Binario_Decimal(String binario, int pos) throws ErroTamanhoNumBinario
    {
        if(pos == 0)
        {
            if (binario.length() != 8) //Se o num binario não tiver 8 dígitos...
            {
                throw new ErroTamanhoNumBinario("Número binário menor ou maior que 8 dígitos");
            }
        }
        int expoente = binario.length() - 1 - pos; //desce um expoente da base 2 a cada posição

        if(pos >= (binario.length())) return 0;//caso base

        //se for 1
        if(binario.charAt(pos) == '1') return (int) (Math.pow(2,expoente) + Binario_Decimal(binario, pos+1));
        //se for 0
        else return Binario_Decimal(binario, pos+1);
    }

    public static class ErroTamanhoNumBinario extends Exception {
        public ErroTamanhoNumBinario(String message) {
            super(message);
        }
    }
}
