package com.example.filmalert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.filmalert.databinding.ActivityMain2Binding;
import com.example.filmalert.databinding.ActivityMain4Binding;


import java.util.ArrayList;
import java.util.Map;

public class MainActivity4 extends AppCompatActivity {

    ArrayList<ModelResearch> list=new ArrayList<>();
ActivityMain4Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMain4Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ResearchAdaptorCustomer researchAdaptorCustomer= new ResearchAdaptorCustomer() ;
        intiateData();
        researchAdaptorCustomer.setList(list);
        binding.recyclyerUser.setAdapter(researchAdaptorCustomer);
    }
    private void intiateData()
    {

        list.add(new ModelResearch(" Definition\n" +
                "The term  \"binge watching\" usually describes the practice of seeing several TV series or films in one sitting. \n" +
                "People can now watch television for extended periods of time without interruption because of the availability of Netflix, Disney+, and other internet streaming services. Tablets, computers, and mobile phones are just a few of the gadgets that can use these platforms. \n" +
                "\n" +
                "Causes\n" +
                "Boredom\n" +
                "The act of watching television helps those who are bored. As a result of their tendency for easily becoming bored and lack of other activities, heavy television watchers use the medium as a way to pass the time (McIlwraith, 1998). Similarly, college students have explicitly said that their summertime binge watching before the start of the academic year was mostly caused by boredom in their leisure time (Devasagayam, 2014).\n" +
                "\n" +
                "\n" +
                "Stress\n" +
                "Another way that people reduce stress is by watching television. Kubey and Csikszentmihalyi (2002) found this to be the case in their research, which involved watching viewers' pulse rates, skin resistance, and brain waves. According to their findings, viewers get a sense of relaxation when they are watching television, but this sensation ends when they stop. Given that students have been observed to experience a multitude of stressors, it is reasonable to assume that their motivation for binge watching is stress relief (Hurst, Baranik, & Daniel, 2013). In actuality, students use binge watching as a means of escape from stressful and unpleasant situations in life. They use television shows as a means of \"leaving\" uncomfortable situations like tests, peer pressure, studying, and uncertainties about their future career and evaluations.\n" +
                "\n" +
                "Loneliness\n" +
                "Students also experience a variety of issues as they adjust to college life in a new environment, such as loneliness and interpersonal difficulties, for which many turn to television in an attempt to meet their desire for social connection (Aherne, 2001; Greenwood & Long, 2009; Hurst et al., 2013). By using television as a way of identification with others (characters and actors) and as a replacement for real-life friendship, students are able to develop a sense of belonging (Greenwood & Long, 2009).\n" +
                "This is facilitated by the development of imagined friendships with characters\n" +
                "where viewers feel as if they have a special connection with them, known as\n" +
                "parasocial relationships (PSR) (Eyal & Cohen, 2006; Greenwood, 2008;\n" +
                "Greenwood & Long, 2009). Research evidence supports the social surrogacy\n" +
                "hypothesis according to which PSRs in favored television shows provide students\n" +
                "with a sense of belonging (Derrick, Gabriel, & Hugenberg, 2009). A significant\n" +
                "predictor of developing PSRs among college students is loneliness indicating that\n" +
                "they turn to their favored programs when they feel lonely and report a reduction\n" +
                "in such feelings while viewing (Derrick et al., 2009; Eyal & Cohen, 2006).\n" +
                "Furthermore, greater parasocial involvement with favorite characters has\n" +
                "also been predicted by increased viewing hours and such relationships have been\n" +
                "established while binge watching for a long duration (Devasagayam, 2014;\n" +
                "44 Greenwood, 2008). Binge watchers report having developed PSRs which propelled them to continue watching the television show so as to sustain the\n" +
                "relationship and spend time with their favorite characters (Devasagayam, 2014).\n" +
                "\n" +
                "Social Engagement\n" +
                "In addition to making up for a lack of social skills, binge watching is seen as a socially desirable activity among young and college audiences alike. Binge watchers are more likely to spend more time interacting with peers about the shows they are watching since it facilitates and improves their engagement in social conversations and peer group interaction (Matrix, 2014; Panda & Pandey, 2017).\n" +
                "The fear of missing out (FoMo), which arises from this demand for relatedness, is a phenomenon where college students and younger viewers worry that they will be left out of cultural discussions if they haven't watched a certain programme (Conlin, Billings, & Averset, 2016; Panda & Pandey, 2017). \n" +
                "More specifically, FoMo influences how quickly drama series are watched, since viewers binge watch to catch up with the story and then join the cultural debate later (Conlin et al., 2016).\n" +
                "Other social aspects that contribute to the interactional influence of television shows are other people's recommendations and comments on the shows (Panda & Pandey, 2017).\n" +
                "\n" +
                "\n" +
                "Habit and Addiction\n" +
                "As a cultural practice, binge watching is ingrained in viewers' daily life and eventually develops into a habit (Mikos, 2016). But the more college students binge watch, the more likely it is that they will continue to do so for longer periods of time, which will lead to dependence (Panda & Pandey, 2017).\n" +
                "This supports the extant literature that claims extended television viewing is an addiction (Kubey & Csikszentmihalyi, 2002; Sussman & Moran, 2013). According to Devasagayam (2014), sixty percent of binge watchers claim to be addicted to the television programmes they watch.\n" +
                "Kubey & Csikszentmihalyi (2002) opted to explain television's addictive qualities by pointing to viewers' multiple reinforcement-based associations between viewing television and lowering tension.\n" +
                "It is, on the one hand, positively reinforced by being at peace when watching and, on the other hand, negatively reinforced by tension and dwelling on the action after it has ended.\n" +
                "The discovery that students who experience anxiety or nervousness after binge watching for an extended period of time are more likely to carry on with this behavior supports this. Students who binge watch more in an attempt to avoid reality create a vicious cycle since they feel comfort in doing so, which intensifies their escape and feeds their addiction (Panda & Pandey, 2017).\n" +
                "\n" +
                "Impact on health\n" +
                "Many people may engage in binge watching occasionally. However, doing this regularly could affect a person’s health by inducing sedentary behavior, sleep problems, and an unbalanced diet.\n" +
                "\n" +
                "Sedentary behavior\n" +
                "Sedentary behavior refers to sitting or laying down with minimal movement. Watching television excessively could cause high levels of sedentary behavior. It also examined 18 other reviews of studies of the relationship between sedentary behavior and health over 10 years. The researchers found links between sedentary behavior and several health problems, including depression, physical disability, and cognitive function. \n" +
                "\n" +
                "\n" +
                "Sleep problems\n" +
                "A person's inability to obtain enough or sufficient quality sleep is one of the many reasons why people have sleep problems. Another reason could be that people stay up late, which can also interfere with sleep. Researchers discovered that people who slept near small screens slept 20 minutes less than those who never slept near small screens. They also discovered that people who slept with a television in their room had shorter sleep durations and more screen time.\n" +
                "It was found that not getting enough sleep could contribute to chronic health problems that include: heart disease, kidney disease, high blood pressure, diabetes, stroke, obesity, and depression. \n" +
                "Diet\n" +
                "Through behaviors that a person displays during extended periods of sitting, such as snacking or consuming low-nutrient meals, binge watching may have an impact on diet. \n" +
                "According to sources, 13 studies involving more than 60,000 kids up to the age of 18 discovered that kids who ate while watching TV typically had worse diets than kids who didn't. They discovered that kids who ate while watching TV tended to eat less fruits and vegetables, high-fat foods, and sugary drinks. Furthermore, the World Health Organisation (WHO) emphasizes the connections between a poor diet and long-term conditions like cancer, heart disease, and diabetes. \n" +
                "Tips to decrease binge watching\n" +
                "In order to decrease the practice of binge watching, there are some tips that students could follow in order to achieve this. These tips include choosing different leisure activities, like sports, setting a fixed bedtime, buying healthier foods and cooking supplies, taking frequent breaks to stretch, and engaging in active tasks like dusting or ironing while watching television. \n" +
                "Lastly, students should restrict the amount of time or episodes spent viewing TV. This is what our project aims for. We will help students achieve this goal by producing an application for them that will enable them to set a specific amount of time for each platform they watch or go on in order to ensure them a healthy lifestyle.\n" +
                "References: \n" +
                "https://www.medicalnewstoday.com/articles/what-is-binge-watching#:~:text=Binge%20watching%20typically%20refers%20to,television%20for%20long%2C%20uninterrupted%20periods.\n" +
                "https://www.researchgate.net/publication/326799916_Binge_watching_why_are_college_students_glued_to_their_screens#:~:text=Young%20adults%2C%20especially%20college%20students,and%20addiction%20deriving%20from%20habit."));

    }
}