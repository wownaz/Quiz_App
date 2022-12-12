package com.example.quizapp

object setData {

    const val name:String="name"
    const val score:String="score"

    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()

        var question1 = QuestionData(
            1,
            "How much bigger is the sun than the earth",

            "200000",
            "250000",
            "290000",
            "300000",
            4
        )
        var question2 = QuestionData(
            2,
            "The hottest planet of our planet ?",

            "Venus",
            "Mercury",
            "Mars",
            "Jupiter",
            1
        )
        var question3 = QuestionData(
            3,
            "When the first artificial Earth satellite launched?",

            "1961",
            "1957",
            "1956",
            "1948",
            2
        )
        var question4 = QuestionData(
            4,
            "Try to guess the planet"+"\n"+"1 day on which lasts 243 earth days, and the year is only 225",

            "Mars",
            "Mercury",
            "Venus",
            "Saturn",
            3
        )

        var question5 = QuestionData(
            5,
            "Try to guess the planet"+"\n"+"1 year at ... lasts 248 earth years",

            "Uranium",
            "Neptune",
            "Saturn",
            "Pluto",
            4
        )

        que.add(question1)
        que.add(question2)
        que.add(question3)
        que.add(question4)
        que.add(question5)
        return que
    }
}