// O código foi desenvolvido na linguagem kotlin e pode ser testado em https://play.kotlinlang.org/

fun main() {
	
    //favor alterar esta variável para os teste
    var teste = "Testando a função"
    println(inverteString(teste))
}

fun inverteString (txt: String): String {
    var aux = ""
    for (i in txt.length -1 downTo 0) {
        aux += txt[i]
    }
    return aux
}
