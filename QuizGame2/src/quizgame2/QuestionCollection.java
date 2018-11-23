
package quizgame2;

import java.util.ArrayList;
import java.util.List;


public class QuestionCollection {
    
    List<Question> artQuestions = new ArrayList();
    List<Question> carQuestions = new ArrayList();
    List<Question> historyQuestions = new ArrayList();
    List<Question> geographyQuestions = new ArrayList();
    
    List<String> categories = new ArrayList();
    
            QuestionCollection() {
            
            // Art Questions    
            artQuestions.add(new Question(Question.enumCategory.artQuestions, "Under vilket årtioende dog Picasso?",
                "1910", "1930","1960","1970","1970"));
            artQuestions.add(new Question(Question.enumCategory.artQuestions, "Vilket år föddes den svenska konstnären Lars-Göran Abrahamsson?",
                "1720", "1950","1860","1970","1950"));

            // Car Questions
            carQuestions.add(new Question(Question.enumCategory.carQuestions, "Vilket land kommer bilmärket Mazda från?",
                "Japan", "China","Sydkorea","Tyskland","Japan"));

            carQuestions.add(new Question(Question.enumCategory.carQuestions, "Vilket land kommer bilmärket Mercedes från?",
                "Tjeckien", "Polen","Tyskland","Grekland","Tyskland"));
            
            // History Questions
            historyQuestions.add(new Question(Question.enumCategory.cultureQuestions, "Vilket år bröt den ryska revolutionen ut?",
                "1560", "1730","1860","1910","1910"));
            historyQuestions.add(new Question(Question.enumCategory.cultureQuestions, "Vilket år avslutades det Amerikanska inbördeskriget?",
                "1925", "1968","1865","1970","1865"));
            
            // Geography Questions
            geographyQuestions.add(new Question(Question.enumCategory.geographyQuestions, "I vilket land ligger staden Istanbull i?",
                "Grekland", "Frankrike","USA","Turkiet","Turkiet"));

            geographyQuestions.add(new Question(Question.enumCategory.geographyQuestions, "Vilket land är världens minsta land?",
                "Vatikanstaten", "Nord-Korea","Malta","Maldiverna","Vatikanstaten"));
            
            
            // List of the question categories
            categories.add("Konstfrågor");
            categories.add("Bilfrågor");
            categories.add("Historiafrågor");
            categories.add("Geografifrågor");
            
            }
}
