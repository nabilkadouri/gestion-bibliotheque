
class Magazine(titre: String, dateDeParution: String, val numero: String): Media(titre, dateDeParution), Consultable {
    override fun afficher() {
        println("Magazine n°$numero : ${getTitre()} (${getDateDeParution()})")
    }

    override fun consulter() {
        println("Le magazine '${getTitre()}', numéro '$numero' (${getDateDeParution()}) est consulté sur place.")
    }

}