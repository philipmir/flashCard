package com.example.carddeck


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity

class PlayActivity : AppCompatActivity() {

    private lateinit var cardText : TextView
    private lateinit var showAnswer : TextView
    private lateinit var showNextNumber : TextView
    private lateinit var livesLeft : TextView

    private lateinit var largerButton : Button
    private lateinit var smallerButton : Button

    private lateinit var cardImageView: ImageView

    private var points: Int = 0
    private var lives: Int = 5

    val deck = Deck




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)


        cardText = findViewById(R.id.currentCard)
        showAnswer = findViewById(R.id.larger_smaller)
        showNextNumber = findViewById(R.id.whatGuess)
        livesLeft = findViewById(R.id.livesLeft)

        largerButton = findViewById(R.id.largerButton)
        smallerButton = findViewById(R.id.smallerButton)


        cardImageView = findViewById(R.id.cardImageView)
        cardImageView.setImageResource(Deck.cards[0].picture)


        //val currentCard = randomNextNumber()
        cardText.text = "you have $points points"
        livesLeft.text = "you have $lives lives left"

        largerButton.setOnClickListener {
            checkWin()
            deck.drawCard()
            if (deck.currentCard.number > deck.nextCard.number){
                points++
                cardText.text = "you have $points points"
            } else {
                lives --
                livesLeft.text = "you have $lives lives left"
                if (lives == 0){
                    startWinLostActivity()
                }
            }
            cardImageView.setImageResource(deck.currentCard.picture)

        }
        smallerButton.setOnClickListener{
            checkWin()
            deck.drawCard()
            if(deck.currentCard.number< deck.nextCard.number){
                points++
                cardText.text = "you have $points points"
            }else{
                lives--
                livesLeft.text = "you have $lives lives left"
                if (lives==0){
                    startWinLostActivity()
                }
            }
            cardImageView.setImageResource(deck.currentCard.picture)
        }

       // val currentCard = deck.currentCard.number
       // val nextCard = deck.nextCard.number

        //fixa så den hämtar alla kort istället
        //cardImageView.setImageResource(Deck.cards[currentCard].picture)

       // showNextNumber.text = "the next value is $nextCard"
    //    showAnswer.text = "the current value is $currentCard"

        }




    fun checkWin() {
        if (deck.cards.size == 1)

        {deck.newRound()


        }
    }


    fun startWinLostActivity() {
        val intent = Intent(this, WinLostActivity::class.java)
        startActivity(intent)
    }

    fun randomNextNumber(): Int { return (1..13).random() }

}
   /* private fun playGame(number: Int, currentCard: Int){

        //start up game
        val startCard = randomNextNumber()
        var card = Deck.cards[startCard]
        cardImageView.setImageResource(card.picture)



        var nextCard = randomNextNumber()



        if (currentCard == nextCard){
            nextCard = randomNextNumber()
        }



        card = Deck.cards[currentCard]

        cardImageView.setImageResource(card.picture)
        val number = card.number


        checkIfNextCardIsLargerOrSmaller(number, nextCard, currentCard)



    }


    private fun checkIfNextCardIsLargerOrSmaller(number: Int, nextCard: Int, currentCard: Int) {


        if (number == 1) {
            if (nextCard < currentCard) {
                points++
            } else {
                lives--
            }
        }

        if (number == 2) {
            if (nextCard > currentCard) {
                points++
            } else {
                lives--
            }
        }


        cardText.text = "you have $points points"
        livesLeft.text = "you have $lives lives left"

        //fixa så den hämtar alla kort istället
        cardImageView.setImageResource(Deck.cards[currentCard].picture)

        showNextNumber.text = "the next value is $nextCard"
        showAnswer.text = "the current value is $currentCard"


    }*/



