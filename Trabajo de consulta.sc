//Método Simpson 1/3

def integracion (f:Double => Double, a: Int, b:Int): Double = (b - a) * ((f(a) + 4* (f((a+b)/2))+f(b)) / 6)

// Aproximacion de integrales definidas

val funcion1 = (x:Double) => (-x*x + 8*x - 12)

val resultado1 = integracion(funcion1, 3, 5)

val funcion2 = (x:Double) => (3*x*x)

val resultado2 = integracion(funcion2, 0, 2)

val funcion3 = (x:Double) => (x + 2*x*x - x*x*x + 5*x*x*x*x)

val resultado3 = integracion(funcion3, -1, 1)

val funcion4 = (x:Double) => ((2*x + 1) / (x*x + x))

val resultado4 = integracion(funcion4, 1, 2)

val funcion5 = (x:Double) => Math.pow(2.7182, x)
val resultado5 = integracion(funcion5, 0, 1)

val funcion6 = (x:Double) => (1 / Math.pow((x - 1), 1/2))

val resultado6 = integracion(funcion6, 2, 3)

val funcion7 = (x:Double) => ((1)/(1+x*x))

val resultado7 = integracion(funcion7, 0, 1)

//Calcular el error en cada aproximación

def calcularValorAbsoluto (valorEsperado: Double, valorObtenido: Double):Double = scala.math.abs(valorEsperado - valorObtenido)

val Error1 = calcularValorAbsoluto(7.33, resultado1)

val Error2 = calcularValorAbsoluto(8, resultado2)

val Error3 = calcularValorAbsoluto(3.333, resultado3)

val Error4 = calcularValorAbsoluto(1.09861, resultado4)

val Error5 = calcularValorAbsoluto(1.71828, resultado5)

val Error6 = calcularValorAbsoluto(0.828427, resultado6)

val Error7 = calcularValorAbsoluto(0.785398, resultado7)



