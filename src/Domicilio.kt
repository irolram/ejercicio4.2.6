class Domicilio(val calle:String, val numero: Int) {
    /**
     * Clase Domicilio
     * @param calle calle del domicilio
     * @param numero numero del domicilio
     * @constructor Crea un domicilio con calle y numero
     */


    fun dirCompleta():String{
        return "$calle, $numero"
    }

}