package com.example.quizapp

object setData {

    const val name:String="name"
    const val score:String="score"

    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()

        var question1 = QuestionData(
            1,
            "What is my name?",

            "Aruzhan",
            "Neila",
            "Shynar",
            "Nazerke",
            4
        )
        var question2 = QuestionData(
            2,
            "What is my surname",

            "Yespolova",
            "Amandolla",
            "Yelubaeva",
            "Nashkenova",
            1
        )
        var question3 = QuestionData(
            3,
            "What is my birthday?",

            "18",
            "25",
            "28",
            "7",
            2
        )
        var question4 = QuestionData(
            4,
            "Month of birth?",

            "September",
            "October",
            "December",
            "November",
            3
        )

        var question5 = QuestionData(
            5,
            "Who is my fav singer?",

            "Selena",
            "Taylor",
            "The weeknd",
            "Zayn",
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