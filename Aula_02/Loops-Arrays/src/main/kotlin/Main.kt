//import java.text.DecimalFormat
//import java.util.Scanner
//
//fun main() {
//    val scan = Scanner(System.`in`);

////    1- Escreva um programa onde informamos 4 idades distintas e depois exibir a maior e a menor idade informada
//
//    var idades = Array<Int>(4){0}
//
//    for (i in 0 until 4){
//        println("Escreva uma idade: ")
//        idades[i] = scan.nextInt();
//    }
//
//    idades.sort();
//
//    println("A maior idade é " + idades[3])
//    println("A menor idade é " + idades[0])
//
//
//
//
////    2- Crie um programa que receba 5 salários de funcionários e aplique um aumento de 10% sobre o valor
//
//    var salarios = DoubleArray(5);
//    for (i in 0 until 5){
//        println("Escreva um salario: ")
//        salarios[i] = scan.nextDouble();
//    }
//
//    val real = DecimalFormat("#.##");
//
//    for (salario in salarios){
//        println("Os salários inseridos com o aumento de 10% são de R$" + real.format((salario + (salario * 0.10))))
//    }
//
//
//
////    3- Crie um sistema que informamos 3 números distintos e aplicamos o dobro dos valores sobre a mesma lista
//
//    var numeros = Array<Int>(3){0};
//    for (x in 0 until 3){
//        println("Escreva um numero: ")
//        numeros[x] = scan.nextInt();
//    }
//
//    for (numero in numeros){
//        println("O dobro de ${numero} é ${numero * 2} ")
//    }
//
//
////    4- Escreva uma função que recebe um array de números inteiros e retorna a soma de todos os elementos.
//
//    val listaNumber = arrayOf(1, 2, 3, 4, 5, 6);
//
//    fun soma(numeros: Array<Int>) : Int{
//        var soma = 0;
//
//        for (numero in numeros){
//            soma += numero;
//        }
//
//        return soma;
//    }
//
//    println("O resultados dos numeros inseridos na lista corresponde à:" + soma(listaNumber));
//
//
//
//
////    5- Escreva uma função que recebe um array de números inteiros e um valor inteiro. A função deve multiplicar todos os elementos do array pelo valor fornecido.
//
//    val arrayNumeros = arrayOf(1, 2, 3, 4, 5, 6);
//    fun multiplicacao(numeros: Array<Int>, n : Int){
//        for (numero in numeros){
//            println("${numero} * ${n} = ${numero * n}");
//        }
//    }
//
//    multiplicacao(arrayNumeros, 9);
//
//
//
//
////    6- Escreva um programa que utilize um loop para calcular a soma dos números de 1 a 100 e imprima o resultado.
//
//    var valor = 0;
//
//    for (i in 0 until 101){
//        valor += i
//    }
//
//    println("O valor da soma dos números entre 0 e 100 é igual a ${valor}")
//
//
//
////    7- Crie um programa onde informamos se queremos permanecer no loop ou não e contabilize todas as vezes que rodarmos as informações
//
//    var loop = -1;
//
//    do {
//        println("Você deseja continuar no loop?");
//        var resposta = scan.next();
//        loop++
//    }while (resposta != "nao")
//
//    println("Você optou permanecer no loop ${loop} vezes");
//
//
//
////    8- Crie um sistema de mercado, onde a pessoa informe os produtos que a mesma comprou, e quanto foi o valor dos produtos, e no final, geramos um exemplo de nota fiscal com o valor total da compra
//
//    fun soma(numeros: Array<Int>) : Int{
//        var soma = 0;
//        for (numero in numeros){
//            soma += numero;
//        }
//        return soma;
//    }
//
//    println("Seja bem vindo!");
//
//    println("Quanto produtos vc comprou?");
//    var quantidade = scan.nextInt() ;
//
//    if(quantidade > 0){
//        var precoProdutos = Array<Int>(quantidade){0};
//        var nomeProdutos = Array<String>(quantidade){""};
//
//        for (i in 0 until quantidade){
//            println("Digite o nome do ${i + 1}° produto");
//            nomeProdutos[i] = scan.next();
//
//            println("Digite o preço do ${i + 1}° produto\n");
//            precoProdutos[i] = scan.nextInt();
//        }
//
//        for (i in 0 until quantidade){
//            println("${nomeProdutos[i]} Custou ${precoProdutos[i]}");
//        }
//        println("O total da compra foi ${soma(precoProdutos)}")
//
//
//    }else{
//        println("Que pena, espero que compre algo na proxima vez :(");
//    }
//
//
//
//
////    9- Crie um programa onde informamos todas as notas de um aluno e no final, calculamos a média das notas do aluno
//
//    println("Quantas notas gostaria de inserir para tirar a média?");
//    var qtd = scan.nextInt();
//
//    var total = 0.0;
//
//    for (n in 0 until qtd){
//        println("Digite uma nota:")
//        total += scan.nextDouble();
//    }
//
//    println("A média das notas passadas é ${total / qtd}")
//
//
//
//
//
////    10- Crie um sistema onde representamos a sequência de fibonnaci, onde possamos definir quantas vezes vamos processar as informações, cujo seguimos a seguinte estrutura
////
////    Fn = N1 + N2;
////
////    N1 = N2;
////
////    N2 = Fn;
//
//    println("Qual termo da sequência de Fibonacci você deseja?");
//    var qtd = scan.nextInt();
//    if (qtd == 1 || qtd == 2){
//        println(1)
//    }
//    else {
//        var N1 = 1;
//        var N2 = 1;
//        var Fn = 0
//
//        println(1);
//        println(1);
//
//        for (n in 0 until  (qtd - 2 )){
//            Fn = N1 + N2;
//            N1 = N2;
//            N2 = Fn;
//
//            println(Fn)
//        }
//    }
//
//
//}