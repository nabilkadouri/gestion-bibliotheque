
abstract class Media (private var titre: String, private var dateDeParution: String) {

    abstract fun afficher()

    fun getTitre() = titre
    fun setTitre(nouveauTitre: String) {
        titre = nouveauTitre
    }

    fun getDateDeParution() = dateDeParution
    fun setDateDeParution(nouvelleDateDeParution: String) {
        dateDeParution = nouvelleDateDeParution
    }
}