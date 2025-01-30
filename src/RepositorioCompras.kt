class RepositorioCompras() {
    /**
     * Clase RepositorioCompras
     * @constructor Crea un repositorio de compras
     * */

    val compras = mutableSetOf<Compra>()

    fun agregarCompra(compra: Compra){
        compras.add(compra)
    }

    fun obtenerDomicilios(): MutableSet<Domicilio> {

        val domicilioUnicos = mutableSetOf<Domicilio>()

        for (compra in compras){
            domicilioUnicos.add(compra.cliente.domicilio)
        }
        return domicilioUnicos
    }


}