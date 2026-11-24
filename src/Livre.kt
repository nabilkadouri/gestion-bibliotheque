class Livre(titre: String, dateDeParution: String, val auteur: String, val editeur: String) : Media(titre, dateDeParution), Empruntable, Consultable{

    private var estEmprunte = false

    override fun afficher() {
        println(" - Livre: Titre =  '${getTitre()}', Auteur = '$auteur', Editeur = '$editeur', Date de parution = '${getDateDeParution()}'")
    }

    override fun emprunter(): Boolean {
        if (estEmprunte) {
            return false
        }
        estEmprunte = true
        println("Livre emprunté : '${getTitre()}' de '$auteur'.")
        return true
    }

    override fun retourner(): Boolean {
        if (!estEmprunte) {
            return false
        }
        estEmprunte = false
        println("Le livre '${getTitre()}' de '$auteur' a été retourné.")
        return true
    }

    override fun consulter() {
        println("Vous consultez le livre ${getTitre()} sur place.")
    }

}