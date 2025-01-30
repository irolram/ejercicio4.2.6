/*
Suponer una lista con datos de las compras hechas por clientes de una empresa a lo largo de un mes, la cual contiene
tuplas con información de cada venta: (cliente, día del mes, monto, domicilio del cliente). Ejemplo:

[("Nuria Costa", 5, 12780.78, "Calle Las Flores 355"),
("Jorge Russo", 7, 699, "Mirasol 218"),
("Nuria Costa", 7, 532.90, "Calle Las Flores 355"),
("Julián Rodriguez", 12, 5715.99, "La Mancha 761"),
("Jorge Russo", 15, 958, "Mirasol 218")]
Escribir una función que reciba como parámetro una lista con el formato mencionado anteriormente y retorne los
domicilios de cada cliente al cual se le debe enviar una factura de compra. Notar que cada cliente puede haber
hecho más de una compra en el mes, por lo que la función debe retornar una estructura que contenga cada domicilio
una sola vez.
 */

fun main(){

    val domicilio1 = Domicilio("Calle Las Flores", 355)
    val domicilio2 = Domicilio("Mirasol",218)
    val domicilio4 = Domicilio("La Mancha", 761)

    val nuria = Cliente("Nuria Costa", domicilio1)
    val jorge = Cliente("Jorge Russo", domicilio2)
    val julian = Cliente("Julián Rodriguez", domicilio4)

    val compra1 = Compra(nuria, 5, 12780.78)
    val compra2 = Compra(jorge, 7, 699.0)
    val compra3 = Compra(nuria, 7, 532.90)
    val compra4 = Compra(julian, 12, 5194.0)
    val compra5 = Compra(jorge, 15, 958.0)


    val listaDeCompra = RepositorioCompras()


    listaDeCompra.agregarCompra(compra1)
    listaDeCompra.agregarCompra(compra2)
    listaDeCompra.agregarCompra(compra3)
    listaDeCompra.agregarCompra(compra4)
    listaDeCompra.agregarCompra(compra5)

    val superhieporke = listaDeCompra.obtenerDomicilios()

    for (domicilio in superhieporke){
        println(domicilio.dirCompleta())
    }

   // listaDeCompra.obtenerDomicilios().forEach { domicilio -> println(domicilio.dirCompleta()) }

}
