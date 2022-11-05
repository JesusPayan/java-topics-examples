package data_types;

/*TODO:
*  IDIENTIFICAR CUAL DE LAS SIGUENTES DECLARACION DE VARIABLES ES CORRECTA Y CUAL ES INCORRECTA
* */
public class Identifier {
    public static void main(String[] args) {
        //Primitive DataTypes
        int itsAnIntVariable = 10; /*Correct*/
        int ItsanIntVariable = 10; /*Incorrect*/
        double $tsADoubleVariable = 1.302;
       // float 572tsAFloatVariable = 12.3f;
        long _its_ALong_Variable = 1000000;

        //Objects
        String coolString = "CoolString";

        CoolClass coolClassInstance = new CoolClass();
        System.out.println(coolClassInstance.name);
    }
}
class CoolClass{
    String name = "This is a coolClass";
}