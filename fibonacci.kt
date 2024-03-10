// O código foi desenvolvido na linguagem kotlin e pode ser testado em https://play.kotlinlang.org/

const val num0 = 0
const val num1 = 1

fun main() {
    //Favor editar este número para os testes
    var entrada = 21
   	var resultadoFinal = pertenceOuNao(entrada)
  	println(resultadoFinal)
}

fun pertenceOuNao (entrada: Int): String {
    return if (entrada == num0 || entrada == num1) {
        "O número pertence à sequência fibonacci" 
    } else if (entrada == sequenciaFibonacci(entrada)) {
        "O número pertence à sequência fibonacci"
    } else {
        "O número NÃO pertence à sequência fibonacci"
    }
}

fun sequenciaFibonacci (entrada: Int): Int {
    var primeiroNum = 0
    var segundoNum = 1
    var somaSequencia = primeiroNum + segundoNum
    
    while (entrada > somaSequencia) {
        somaSequencia = primeiroNum + segundoNum
        primeiroNum = segundoNum
		segundoNum = somaSequencia
    }
    return somaSequencia
}
