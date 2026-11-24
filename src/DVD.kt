class DVD (titre: String, dateDeParution: String, val duree: Int, val genre: String) : Media(titre, dateDeParution), Empruntable {

    private var estEmprunte = false

    override fun afficher() {
        println(" - DVD: Titre = '${getTitre()}', Durée = '$duree' secondes, Genre = '$genre'")
    }

    override fun emprunter(): Boolean {
        if (estEmprunte) {
            return false
        }
        estEmprunte = true
        println("Le DVD '${getTitre()}' a été emprunté.")
        return true
    }

    override fun retourner(): Boolean {
        if (!estEmprunte) {
            return false
        }
        estEmprunte = false
        println("Le DVD '${getTitre()}' a été retourné.")
        return true
    }
}