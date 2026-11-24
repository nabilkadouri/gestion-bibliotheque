class Journal(titre: String, dateDeParution: String) : Media(titre, dateDeParution), Consultable {
    override fun afficher() {
        println("Journal : ${getTitre()} (${getDateDeParution()})")
    }

    override fun consulter() {
        println("Le journal '${getTitre()}' du '${getDateDeParution()}' est consulté sur place.")
    }
}