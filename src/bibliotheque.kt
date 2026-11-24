class Bibliotheque {
    private val medias = mutableListOf<Media>()
    private val emprunts = mutableListOf<Media>()

    fun ajouterMedia(media: Media) {
        medias.add(media)
    }

    fun afficherMedias() {
        for ((index, media) in medias.withIndex()) {
            println("$index - ${media.getTitre()}")
        }
    }

    fun getMedia(index: Int): Media? = medias.getOrNull(index)

    fun emprunter(media: Media) {
        if (media is Empruntable) {
            if (media.emprunter()) {
                emprunts.add(media)
            }
        }
    }

    fun retourner(media: Media) {
        if (media is Empruntable) {
            if (media.retourner()) {
                emprunts.remove(media)
            }
        }
    }

    fun consulter(media: Media) {
        if (media is Consultable) {
            media.consulter()
        }
    }

    fun afficherEmprunts() {
        println("Emprunts en cours:")
        for (m in emprunts) {
            m.afficher()
        }
    }
}