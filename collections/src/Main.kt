fun main() {
    //1
    /*
    val planetes = arrayOf("mercure", "Venus", "terre", "Mars",
        "Jupiter", "saturne", "Uranus", "Neptune")

    println(planetes.first())
    println(planetes.last())

    println(planetes.indexOf("terre"))

    planetes[2] = "Terre"

    println(planetes[2])

    println(planetes.filter { it.uppercase().startsWith('M')})

    for(planete in planetes) {
        println(planete.capitalize())
    }
    */
    //2
    /*
    val entiers = mutableListOf<Int>()
    for(i in 1..10){
        entiers.add( (1..100).random())
    }
    println(entiers)

    val somme = entiers.sum()
    println(somme)

    val plusPetit = entiers.min()
    println(plusPetit)

    val plusGrand = entiers.max()
    println(plusGrand)

    var listePair = mutableListOf<Int>()
    var listeImpair = mutableListOf<Int>()

    for(i in entiers) {
        if(i % 2 == 0) {
            listePair.add(i)
        }
        else {
            listeImpair.add(i)
        }
    }

    println("Liste des nombres pair :")
    for(i in listePair) println(i)

    println("Liste des nombres impair :")
    for(i in listeImpair) println(i)
    */
    //3
    /*
    val notes = mutableMapOf("Adrien" to mutableListOf(15,12,
        10),"Bertrand" to mutableListOf(12,10))

    notes.getOrPut("Toto") { mutableListOf() }.add(8)

    notes.getOrPut("Adrien") { mutableListOf() }.add(6)

    for ((nom, notesEleve) in notes) {
        val notesFloat = notesEleve.map { it.toDouble() }
        val moyenne = notesFloat.average()

        if (moyenne >= 10) {
            println("Nom : $nom")
            println("Notes : ${notesEleve.joinToString(", ")}")
            println("Moyenne : $moyenne")
            println()
        }
    }
    */
    //4.1
    /*
    fun serieInverse(n:Int) {
        var serie = arrayListOf<Int>()

        for (i in 1..n) {
            serie += i
        }

        serie.reverse()

        return println(serie)
    }

    serieInverse(7)
    */
    //4.2
    /*
    fun tabPair(tab: Array<Int>): List<Int> {
        val listPair = mutableListOf<Int>()

        for (i in tab){
            if ( i % 2 == 0)
                listPair.add(i)
        }

        return listPair
    }
    */
    //4.3
    /*
    fun tabImpair(tab: Array<Int>): List<Int> {
        val listImpair = mutableListOf<Int>()

        for (i in tab){
            if ( i % 2 != 0)
                listImpair.add(i)
        }
        return listImpair
    }
    */
    //4.4
    /*
    fun listeDiviseurs(nb: Int): List<Int>{
        val diviseurs = mutableListOf<Int>()
        val diviseurs = mutableListOf<Int>()

        for (i in 1..nb) {
            if (nb % i == 0) {
                diviseurs.add(i)
            }
        }
        return diviseurs
    }

    //4.5

    fun estPremier(nb: Int): Boolean = if ( listeDiviseurs(nb).size == 2) true else false
    */
    //4.6
    /*
    fun estParfait(nb: Int): Boolean {
        val parfait = arrayOf(6,28,496,8128)

        if (nb in parfait) {
            return true
        }
        else {
            return false
        }
    }
    */
    //4.7
    /*
    fun sommeChiffres(nb: Int): Int{
        var somme = 0
        var nb2 = nb

        while (nb2 != 0){
            somme += nb2 % 10
            nb2 /= 10
        }
        return somme
    }

    //4.8

    fun nombresAmis(nb1: Int,nb2: Int): Boolean = if ( sommeChiffres(nb2) == sommeChiffres(nb1)) true else false
     */
    //4.9

    fun tabParite(tab: Array<Int>): MutableMap<String, MutableList<Int>> {
        val liste = mutableMapOf<String, MutableList<Int>>("pair" to mutableListOf(), "impair" to mutableListOf())

        for (nb in tab) {
            if (nb % 2 == 0) liste.getOrPut("pair") {mutableListOf()}.add(nb)
            else liste.getOrPut("impair") {mutableListOf()}.add(nb)
        }

        return liste
    }
}