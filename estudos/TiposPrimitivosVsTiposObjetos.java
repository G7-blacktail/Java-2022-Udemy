public class TiposPrimitivosVsTiposObjetos{
    public static void main(String[] args) {
        // Wappers  

        byte _byte = 100;
        Byte _byteWrappers = 1;
            System.out.println("byte primitivo " + _byte);
            System.out.println("Byte Objeto " + _byteWrappers.byteValue());

        short _short = 1000;
        Short _shortWrappers = 1001;
            System.out.println("short primitivo " + _short);
            System.out.println("Short Objeto" + _shortWrappers);

        int _int = 10000;
        Integer _intWrappers = 1000000;
            System.out.println("int primitivo " + _int);
            System.out.println("Integer (int) Objeto " + _intWrappers);
        // Integer valor = new Integer(0) deprecated

        long _long = 10000000;
        Long _longWrappers = 100000002L;
            System.out.println("long primitivo " + _long);
            System.out.println("Long Objeto " + _longWrappers);

        float _float = 32.85214F;
        Float _floatWrappers = 52.655854f;
            System.out.println("float primitivo " + _float);
            System.out.println("Float Objeto " + _floatWrappers);

        double _double = 23.856d;
        Double _doubleWrappers = 52.8525d;
            System.out.println("double primitivo " + _double);
            System.out.println("Double Objeto " + _doubleWrappers);

        boolean _boolean = false;
        Boolean _booleanWrappers = Boolean.parseBoolean("false");
            System.out.println("boolean primitivo " + _boolean);
            System.out.println("Boolean Objeto" + _booleanWrappers);
            System.out.println("Concatenando com uma String vazia " + ("" + _booleanWrappers).toUpperCase());
            System.out.println("Transformando em uma string com to string\na variável está vazia? " + _booleanWrappers.toString().isEmpty());

        char _char = '#';
        Character _charWrappers = '!';
            System.out.println("char primitivo " + _char);
            System.out.println("Character (char) Objeto " + _charWrappers);
 
    }
}