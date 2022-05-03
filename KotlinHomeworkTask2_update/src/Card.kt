/**
 *  Класс карты
 */
class Card(private val rank: Int, private val suit: Int) {
    private val cardRank = arrayOf("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace")
    private val cardSuit = arrayOf("Clubs", "Diamonds", "Spades", "Hearts")
    private val rankOffset = 2
    private val suitOffset = 1

    fun getCardRank(): Int =
        rank

    fun getCardSuit(): Int =
        suit

    fun checkSuit() {
        println("Let me check, if the suit of this card is correct...")
        if (suit > 0 && suit <= cardRank.size) {
            println("The suit is correct.")
        } else {
            println("The suit is incorrect.")
        }
    }

    override fun hashCode(): Int {
        return 27 * rank + suit
    }

    fun equals(card: Card): Boolean {
        return if (card is Card) {
            rank == card.getCardRank() && suit == card.getCardSuit()
        } else {
            false
        }
    }

    override fun toString(): String {
        val cardRankStringNumber = rank - rankOffset
        val cardSuitStringNumber = suit - suitOffset
        return "Suit: " + cardSuit[cardSuitStringNumber] + ", Rank: " + cardRank[cardRankStringNumber]
    }

    fun checkDeck(): String {
        return if (rank >= 0 && rank < cardRank.size) {
            "This card is from a normal to the deck."
        } else {
            "This card is not from a normal deck."
        }
    }

    fun compareCard(comparable: Card): String {
        if (rank > comparable.getCardRank()) {
            return "This card is stronger."
        } else {
            return "This card is weaker."
        }
    }

    fun compareTo(comparedSuit: Card): Int {
        return suit - comparedSuit.getCardSuit()
    }
}