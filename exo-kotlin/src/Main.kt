//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    /*1.a
    print("Entrez votre nom : ")
    val nom = readLine()
    println("Bonjour $nom")
    */
    /*1.b
    print("Entrez un premier nombre : ")
    val n1 = readLine()!!.toInt()

    print("Entrez un deuxième nombre : ")
    val n2 = readLine()!!.toInt()

    val somme = n1 + n2
    println("La somme des 2 nombres est : $somme")

    val difference = if (n1 > n2) n1 - n2 else n2 - n1
    println("La différence entre les 2 nombres est : $difference")

    val produit = n1 * n2
    println("Le produit des 2 nombres est : $produit")

    val quotient = if (n1 > n2) n1 / n2 else n2 / n1
    println("Le quotient des 2 nombres est : $quotient")
    */
    /*1.1
    print("Entrez votre age : ")
    val age = readLine()!!.toInt()

    if (age < 26) {
        println("Vous avez le droit au tarif réduit.")
    } else {
        println("Vous n'avez pas le droit au tarif réduit.")
    }
    */
    /*1.2
    print("Entrez un nombre : ")
    val n1 = readLine()!!.toInt()

    print("Entrez un second nombre : ")
    val n2 = readLine()!!.toInt()

    if (n1 > 0 && n2 > 0 || n1 < 0 && n2 < 0) {
        println("produit positif")
    } else {
        println("produit négatif")
    }
    */
    /*1.3
    print("Entrez une année : ")
    val annee = readLine()!!.toInt()

    if (annee % 4 == 0) {
        if (annee % 100 == 0) {
            if (annee % 400 == 0) {
                println("année bissextile")
            } else {
                println("année non bissextile")
            }
        } else {
            println("année bissextile")
        }
    }
    */
    /*2.1
    print("Entrez un nombre : ")
    val nb = readLine()!!.toInt()

    for (i in 1..nb) {
        println("$i")
    }
    */
    /*2.2
    print("Entrez un nombre : ")
    val nb = readLine()!!.toInt()

    if (nb % 2 == 0) {
        println("nombre pair")

        for (i in nb..nb+10 step 2) {
            println("$i")
        }
    } else {
        println("nombre impair")

        for (i in nb..nb+10 step 2) {
            println("$i")
        }
    }
    */
    /*2.3
    print("Afficher les multiples de : ")
    var nb = readLine()!!.toInt()

    println("jusqu'à : ")
    var nbfois = readLine()!!.toInt()

    for (i in 1..nbfois) {
        var res = nb * i
        println("$res")
    }
    */
}