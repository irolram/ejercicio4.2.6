class RepositorioCompras() {
    /**
     * Clase RepositorioCompras
     * @constructor Crea un repositorio de compras
     * */

    val compras = mutableListOf<Compra>()
    fun agregarCompra(compra: Compra){
        compras.add(compra)
    }
    fun guardarDomicilios(domicilios: Set<Domicilio>){
        for (i in domicilios){

        }
    }
}