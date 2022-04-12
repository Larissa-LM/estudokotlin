fun main(){
    println("Bem vindo ao Bytebank")

    // for(i in 1..5){
    //     // if(i == 2){
    //     //     break
    //     // }
    //      if(i == 2){
    //         continue
    //     }
    var i = 0
    while(i < 5){

        val titular : String = "Larissa $i"
        val numeroConta : Int = 1000 + i
        var saldo : Double = i + 10.0
        //saldo -= 1000
        //saldo = 100 + 2.0
        //saldo = saldo + 200

        println("Titular: $titular")
        println("Numero da conta: $numeroConta")
        println("Saldo da conta: $saldo")
        println()
        i++
        //testaCondicoes(saldo)
    }
    //  for(i in 5 downTo(decrescente) 1){
    //     val titular : String = "Larissa $i"
    //     val numeroConta : Int = 1000 + i
    //     var saldo : Double = i + 10.0
    //     //saldo -= 1000
    //     //saldo = 100 + 2.0
    //     //saldo = saldo + 200

    //     println("Titular: $titular")
    //     println("Numero da conta: $numeroConta")
    //     println("Saldo da conta: $saldo")
    //     println()
    //     //testaCondicoes(saldo)
    // }
    //   for(i in 5 downTo 1 step (pula de 2 em 2) 2){
    //     val titular : String = "Larissa $i"
    //     val numeroConta : Int = 1000 + i
    //     var saldo : Double = i + 10.0
    //     //saldo -= 1000
    //     //saldo = 100 + 2.0
    //     //saldo = saldo + 200

    //     println("Titular: $titular")
    //     println("Numero da conta: $numeroConta")
    //     println("Saldo da conta: $saldo")
    //     println()
    //     //testaCondicoes(saldo)
    // }


 }

fun testaCondicoes(saldo:Double){
        // if (saldo > 0.0){
    //     println("conta é positiva")
    // } else if (saldo == 0.0){
    //     println("conta é neutra")
    // } else{
    //     println("conta negativa")
    // }

    //            OU 

    // when{
    //     saldo > 0.0 ->{
    //         println("conta é positiva")
    //     }
    //     saldo == 0.0 ->{
    //         println("conta é neutra")
    //     }
    //     else ->{
    //         println("conta negativa")
    //     }
    // }

    //            OU

      when {
        saldo > 0.0 -> println("conta é positiva")
        
        saldo == 0.0 -> println("conta é neutra")
        
        else -> println("conta negativa")
        
    }
}

