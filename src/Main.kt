fun main() {

    fun lireMedia(bibliotheque: Bibliotheque): Media? {
        bibliotheque.afficherMedias()
        print("Numéro du média : ")
        val numero = readlnOrNull()?.toIntOrNull()
        if (numero == null) {
            println("Veuillez saisir un nombre.")
            return null
        }
        val media = bibliotheque.getMedia(numero)
        if (media == null) {
            println("Ce numéro n'existe pas.")
        }
        return media
    }

    val bibliotheque = Bibliotheque()

    bibliotheque.ajouterMedia(Livre("1984", "1972-01-01", "George Orwell", "Gallimard"))
    bibliotheque.ajouterMedia(DVD("Inception", "2010-01-01", 8880, "Action"))
    bibliotheque.ajouterMedia(EnregistrementAudio("Beethoven - Symphonie No.9", "1967-01-01", 960, "Classical"))
    bibliotheque.ajouterMedia(Magazine("National Geographic", "2026-10-28", "10"))
    bibliotheque.ajouterMedia(Journal("Le Monde", "2026-10-28"))

    var continuer = true
    while (continuer) {
        println()
        println("1. Afficher les médias")
        println("2. Emprunter")
        println("3. Retourner")
        println("4. Consulter")
        println("5. Afficher les emprunts")
        println("0. Quitter")
        print("Votre choix : ")

        when (readlnOrNull()?.toIntOrNull()) {
            1 -> bibliotheque.afficherMedias()
            2 -> lireMedia(bibliotheque)?.let { bibliotheque.emprunter(it) }
            3 -> lireMedia(bibliotheque)?.let { bibliotheque.retourner(it) }
            4 -> lireMedia(bibliotheque)?.let { bibliotheque.consulter(it) }
            5 -> bibliotheque.afficherEmprunts()
            0 -> continuer = false
            else -> println("Choix invalide.")
        }
    }
    println("Au revoir !")
}
