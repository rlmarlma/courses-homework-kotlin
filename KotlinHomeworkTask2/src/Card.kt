class Card constructor(val rank: Int, val suit: Int){
    val cardRank = arrayOf("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace")
    val cardSuit = arrayOf("Clubs", "Diamonds", "Spades", "Hearts")
    val rankOffset = 2
    val suitOffset = 1
    var card = arrayOf(rank, suit)

    init {
        card = arrayOf(rank, suit)
    }

    fun getCardRank() : Int {
        return rank
    }

    fun getCardSuit() : Int {
        return suit
    }

    fun checkSuit() : Unit {
        println("Let me check, if the suit of this card is correct...")
        if (suit > 0 && suit <= cardRank.size){
            println("The suit is correct.")
        }else{
            println("The suit is incorrect.")
        }
    }

    fun HashCode() : Int {
        return 27*rank + suit
    }

    fun equals(card: Card) : Boolean {
        if(card is Card){
            return rank == card.getCardRank() && suit == card.getCardSuit()
        }else{
            return false
        }
    }

    override fun toString() : String {
        var i = rank - rankOffset
        var j = suit - suitOffset
        return "Suit: " + cardSuit[j] + ", Rank: " + cardRank[i]
    }

    fun checkDeck() : String {
        if(rank >= 0 && rank < cardRank.size){
            return "This card is from a normal to the deck."
        }else{
            return "This card is not from a normal deck."
        }
    }

    fun compareCard(comparable: Card) : String {
        if(comparable is Card){
            if(rank > comparable.getCardRank()){
                return "This card is stronger."
            }else{
                return "This card is weaker."
            }
        }else{
            return "This is not a card."
        }
    }

    fun compareTo(comparedSuit: Card) : Int {
            return suit - comparedSuit.getCardSuit()
    }
}