class Coche(var color: String, val marca: String,val modelo : String , var numCaballo: Int,var numPuerta : Int, var matricula: String){



    init {
        require(marca.isNotEmpty()){"La marca no puede estar vacía"}
        require(modelo.isNotEmpty()){"El modelo no puede estar vacio"}
    }

    override fun toString(): String {
        return "Marca: $marca , Modelo: $modelo , Numero de caballos: $numCaballo , Numero de puerta: $numPuerta, Matricula: $matricula, Color: $color"
    }
}



fun main(){

}