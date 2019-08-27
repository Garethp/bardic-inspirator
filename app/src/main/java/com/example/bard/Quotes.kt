package com.example.bard

class Quotes {
    private val quotes = listOf(
        Quote("Hey Jude", "Hey Jane. \r\nDon't make it bad. \r\nTake a live monster, and it deader. \r\nRemember, to stab into it's heart. \r\nThen you can start, to make it deader"),
        Quote("Let it Be", "When I find myself in times of trouble, \r\nInvandra appears to me. \r\nSinging words of healing: Let 'em heal"),
        Quote("Baby Got Back", "I like big rolls and I cannot lie. \r\nYou other brothers can't deny. \r\nWhen a dice rolls in with an itty bitty spin \r\nAnd a 20 on it's face you get SPRUNG!")
    )

    private var lastQuote = Quote("", "")

    fun getQuotes(): Collection<Quote> {
        return quotes
    }

    fun getRandomQuote(): Quote {
        var quote = quotes.random()

        while (quote.quote == lastQuote.quote) {
            quote = quotes.random()
        }

        lastQuote = quote
        return quote
    }
}