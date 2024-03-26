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

fun main() {
    val compte = Compte(1000.0)

    println("Balance initial: ${compte.getBalance()}")
    compte.deposer(500.0)

    println("Balance après dépôt: ${compte.getBalance()}")
    compte.retirer(200.0)

    println("Balance après retrait: ${compte.getBalance()}")
    compte.ajoutInteret(0.05)

    println("Balance après ajout intérêt: ${compte.getBalance()}")
}