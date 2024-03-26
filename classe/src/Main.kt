class Compte {
    private var balance: Double = 0.0

    constructor()

    constructor(balanceInitial: Double) {
        this.balance = balanceInitial
    }
    fun getBalance(): Double = this.balance

    fun deposer(montant: Double) {
        this.balance += montant
    }
    fun retirer(montant: Double) {
        this.balance -= montant
    }
    fun ajoutInteret(tauxInteret: Double) {
        this.balance *= (1 + tauxInteret)
    }
}

class Employe(var Matricule: Int, var Nom: String, var Prenom: String, var anneeEmbauche: Int, var Salaire: Double) {
    var anciennete = 2024

    fun anciennete(annee:Int) {
        var anneeAnciennete = annee - anneeEmbauche
    }
}

fun main() {
    /*
    val compte = Compte(1000.0)

    compte.deposer(500.0)
    compte.retirer(200.0)
    compte.ajoutInteret(0.05)

    println("${compte.getBalance()}")
    */
}