class EnregistrementAudio(titre: String, dateDeParution: String, val duree: Int, val genre: String): Media(titre, dateDeParution), Empruntable {

    private var estEmprunte = false

    override fun afficher() {
        println(" - Enregistrement Audio: Titre = '${getTitre()}', Durée = '$duree' secondes, Genre = '$genre'")
    }

    override fun emprunter(): Boolean {
        if (estEmprunte) {
            return false
        }
        estEmprunte = true
        println("L'enregistrement audio '${getTitre()}' a été emprunté.")
        return true
    }

    override fun retourner(): Boolean {
        if (!estEmprunte) {
            return false
        }
        estEmprunte = false
        println("L'enregistrement audio '${getTitre()}' a été retourné.")
        return true
    }
}