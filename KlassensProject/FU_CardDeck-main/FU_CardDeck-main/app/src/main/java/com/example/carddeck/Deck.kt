package com.example.carddeck

object Deck {

    val cards = mutableListOf<Card>()
    private var garbageCards = mutableListOf<Card>()
    lateinit var nextCard: Card
    lateinit var currentCard: Card


    init {
        createCards()
        cards.shuffle()
    }


    fun drawCard():Card {
        nextCard = cards.removeAt(0)
        currentCard= cards[0]


        garbageCards.add(currentCard)

        return nextCard }


    fun newRound(){
        garbageCards.add(currentCard)
        garbageCards.shuffle()

        cards.addAll(garbageCards)

        cards.shuffle()
    }

    //shared preferences

    fun createCards(){
        //clubs
        cards.add(Card("Clubs Ace", 1, R.drawable.clubsace))
        cards.add(Card("Clubs two", 2, R.drawable.clubs_2))
        cards.add(Card("Clubs three", 3, R.drawable.clubs_3))
        cards.add(Card("Clubs four", 4, R.drawable.clubs_4))
        cards.add(Card("Clubs five", 5, R.drawable.clubs_5))
        cards.add(Card("Clubs six", 6, R.drawable.clubs_6))
        cards.add(Card("Clubs seven", 7, R.drawable.clubs_7))
        cards.add(Card("Clubs eight", 8, R.drawable.clubs_8))
        cards.add(Card("Clubs nine", 9, R.drawable.clubs_9))
        cards.add(Card("Clubs ten", 10, R.drawable.clubs_10))
        cards.add(Card("Clubs Jack", 11, R.drawable.clubsjack))
        cards.add(Card("Clubs Queen", 12, R.drawable.clubsqueen))
        cards.add(Card("Clubs King", 13, R.drawable.clubsking))


        //spades
        cards.add(Card("Spades Ace", 1, R.drawable.spadesace))
        cards.add(Card("Spades two", 2, R.drawable.spadestwo))
        cards.add(Card("Spades three", 3, R.drawable.spadesthree))
        cards.add(Card("Spades four", 4, R.drawable.spadesfour))
        cards.add(Card("Spades five", 5, R.drawable.spadesfive))
        cards.add(Card("Spades six", 6, R.drawable.spadessix))
        cards.add(Card("Spades seven", 7, R.drawable.spadesseven))
        cards.add(Card("Spades eight", 8, R.drawable.spadeseight))
        cards.add(Card("Spades nine", 9, R.drawable.spadesnine))
        cards.add(Card("Spades ten", 10, R.drawable.spadesten))
        cards.add(Card("Spades Jack", 11, R.drawable.spadesjack))
        cards.add(Card("Spades Queen", 12, R.drawable.spadesqueen))
        cards.add(Card("Spades King", 13, R.drawable.spadesking))


        //hearts
        cards.add(Card("Hearts Ace", 1, R.drawable.heartsace))
        cards.add(Card("Hearts two", 2, R.drawable.heartstwo))
        cards.add(Card("Hearts three", 3, R.drawable.heartsthree))
        cards.add(Card("Hearts four", 4, R.drawable.heartsfour))
        cards.add(Card("Hearts five", 5, R.drawable.heartsfive))
        cards.add(Card("Hearts six", 6, R.drawable.heartssix))
        cards.add(Card("Hearts seven", 7, R.drawable.heartsseven))
        cards.add(Card("Hearts eight", 8, R.drawable.heartseight))
        cards.add(Card("Hearts nine", 9, R.drawable.heartsnine))
        cards.add(Card("Hearts ten", 10, R.drawable.heartsten))
        cards.add(Card("Hearts Jack", 11, R.drawable.heartsjack))
        cards.add(Card("Hearts Queen", 12, R.drawable.heartsqueen))
        cards.add(Card("Hearts King", 13, R.drawable.heartsking))

        //Diamonds
        cards.add(Card("Diamonds Ace", 1, R.drawable.diamondsace))
        cards.add(Card("Diamonds two", 2, R.drawable.diamondstwo))
        cards.add(Card("Diamonds three", 3, R.drawable.diamondsthree))
        cards.add(Card("Diamonds four", 4, R.drawable.diamondsfour))
        cards.add(Card("Diamonds five", 5, R.drawable.diamondsfive))
        cards.add(Card("Diamonds six", 6, R.drawable.diamondssix))
        cards.add(Card("Diamonds seven", 7, R.drawable.diamondsseven))
        cards.add(Card("Diamonds eight", 8, R.drawable.diamondseight))
        cards.add(Card("Diamonds nine", 9, R.drawable.diamondsnine))
        cards.add(Card("Diamonds ten", 10, R.drawable.diamondsten))
        cards.add(Card("Diamonds Jack", 11, R.drawable.diamondsjack))
        cards.add(Card("Diamonds Queen", 12, R.drawable.diamondsqueen))
        cards.add(Card("Diamonds King", 13, R.drawable.diamondsking))

    }
}