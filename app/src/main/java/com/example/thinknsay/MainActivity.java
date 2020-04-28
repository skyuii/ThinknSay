package com.example.thinknsay;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.database.Cursor;
import android.util.Log;
import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    VocabDatabaseHelper vocabHelper;
    ArrayList<Vocab> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vocabHelper = new VocabDatabaseHelper(this);
        addData();
    }

    public  void addData() {

        //occupation category
        vocabHelper.insertData(new Vocab(1,"accountant","occupation"));
        vocabHelper.insertData(new Vocab(2,"actor","occupation"));
        vocabHelper.insertData(new Vocab(3,"actress","occupation"));
        vocabHelper.insertData(new Vocab(4,"air hostess","occupation"));
        vocabHelper.insertData(new Vocab(5,"artist","occupation"));
        vocabHelper.insertData(new Vocab(6,"astronaut","occupation"));
        vocabHelper.insertData(new Vocab(7,"babysitter","occupation"));
        vocabHelper.insertData(new Vocab(8,"barber","occupation"));
        vocabHelper.insertData(new Vocab(9,"carpenter","occupation"));
        vocabHelper.insertData(new Vocab(10,"chef","occupation"));

        vocabHelper.insertData(new Vocab(11,"clerk","occupation"));
        vocabHelper.insertData(new Vocab(12,"cook","occupation"));
        vocabHelper.insertData(new Vocab(13,"dancer","occupation"));
        vocabHelper.insertData(new Vocab(14,"dentist","occupation"));
        vocabHelper.insertData(new Vocab(15,"detective","occupation"));
        vocabHelper.insertData(new Vocab(16,"doctor","occupation"));
        vocabHelper.insertData(new Vocab(17,"driver","occupation"));
        vocabHelper.insertData(new Vocab(18,"editor","occupation"));
        vocabHelper.insertData(new Vocab(19,"engineer","occupation"));
        vocabHelper.insertData(new Vocab(20,"eye doctor","occupation"));

        vocabHelper.insertData(new Vocab(21,"farmer","occupation"));
        vocabHelper.insertData(new Vocab(22,"fireman","occupation"));
        vocabHelper.insertData(new Vocab(23,"gardener","occupation"));
        vocabHelper.insertData(new Vocab(24,"guide","occupation"));
        vocabHelper.insertData(new Vocab(25,"hairdresser","occupation"));
        vocabHelper.insertData(new Vocab(26,"janitor","occupation"));
        vocabHelper.insertData(new Vocab(27,"lawyer","occupation"));
        vocabHelper.insertData(new Vocab(28,"maid","occupation"));
        vocabHelper.insertData(new Vocab(29,"mechanic","occupation"));
        vocabHelper.insertData(new Vocab(30,"model","occupation"));

        vocabHelper.insertData(new Vocab(31,"nurse","occupation"));
        vocabHelper.insertData(new Vocab(32,"painter","occupation"));
        vocabHelper.insertData(new Vocab(33,"plumber","occupation"));
        vocabHelper.insertData(new Vocab(34,"photographer","occupation"));
        vocabHelper.insertData(new Vocab(35,"pilot","occupation"));
        vocabHelper.insertData(new Vocab(36,"policeman","occupation"));
        vocabHelper.insertData(new Vocab(37,"postman","occupation"));
        vocabHelper.insertData(new Vocab(38,"professor","occupation"));
        vocabHelper.insertData(new Vocab(39,"reporter","occupation"));
        vocabHelper.insertData(new Vocab(40,"salesman","occupation"));

        vocabHelper.insertData(new Vocab(41,"security guard","occupation"));
        vocabHelper.insertData(new Vocab(42,"shop assistant","occupation"));
        vocabHelper.insertData(new Vocab(43,"shopkeeper","occupation"));
        vocabHelper.insertData(new Vocab(44,"singer","occupation"));
        vocabHelper.insertData(new Vocab(45,"soldier","occupation"));
        vocabHelper.insertData(new Vocab(46,"sport man","occupation"));
        vocabHelper.insertData(new Vocab(47,"student","occupation"));
        vocabHelper.insertData(new Vocab(48,"teacher","occupation"));
        vocabHelper.insertData(new Vocab(49,"technician","occupation"));
        vocabHelper.insertData(new Vocab(50,"writer","occupation"));

        //color category
        vocabHelper.insertData(new Vocab(51,"black","color"));
        vocabHelper.insertData(new Vocab(52,"blue","color"));
        vocabHelper.insertData(new Vocab(53,"brown","color"));
        vocabHelper.insertData(new Vocab(54,"green","color"));
        vocabHelper.insertData(new Vocab(55,"gray","color"));
        vocabHelper.insertData(new Vocab(56,"orange","color"));
        vocabHelper.insertData(new Vocab(57,"pink","color"));
        vocabHelper.insertData(new Vocab(58,"purple","color"));
        vocabHelper.insertData(new Vocab(59,"red","color"));
        vocabHelper.insertData(new Vocab(60,"silver","color"));

        vocabHelper.insertData(new Vocab(61,"white","color"));
        vocabHelper.insertData(new Vocab(62,"yellow","color"));
        vocabHelper.insertData(new Vocab(63,"violet","color"));
        vocabHelper.insertData(new Vocab(64,"biege","color"));
        vocabHelper.insertData(new Vocab(65,"gold","color"));
        vocabHelper.insertData(new Vocab(66,"old rose","color"));
        vocabHelper.insertData(new Vocab(67,"indigo","color"));
        vocabHelper.insertData(new Vocab(68,"navi blue","color"));
        vocabHelper.insertData(new Vocab(69,"crimson","color"));
        vocabHelper.insertData(new Vocab(70,"turquoise","color"));

        vocabHelper.insertData(new Vocab(71,"dark blue","color"));
        vocabHelper.insertData(new Vocab(72,"light blue","color"));
        vocabHelper.insertData(new Vocab(73,"rainbow","color"));
        vocabHelper.insertData(new Vocab(74,"magenta","color"));
        vocabHelper.insertData(new Vocab(75,"khaki","color"));
        vocabHelper.insertData(new Vocab(76,"sky blue","color"));
        vocabHelper.insertData(new Vocab(77,"royal blue","color"));
        vocabHelper.insertData(new Vocab(78,"deep pink","color"));

        //fruit category
        vocabHelper.insertData(new Vocab(79,"apple","fruit"));
        vocabHelper.insertData(new Vocab(80,"apricot","fruit"));
        vocabHelper.insertData(new Vocab(81,"avocado","fruit"));
        vocabHelper.insertData(new Vocab(82,"banana","fruit"));
        vocabHelper.insertData(new Vocab(83,"bilberry","fruit"));
        vocabHelper.insertData(new Vocab(84,"blackcurrant","fruit"));
        vocabHelper.insertData(new Vocab(85,"blueberry","fruit"));
        vocabHelper.insertData(new Vocab(86,"breadfruit","fruit"));
        vocabHelper.insertData(new Vocab(87,"cantaloupe","fruit"));
        vocabHelper.insertData(new Vocab(88,"cherimoya","fruit"));

        vocabHelper.insertData(new Vocab(89,"cherry","fruit"));
        vocabHelper.insertData(new Vocab(90,"chinese pear","fruit"));
        vocabHelper.insertData(new Vocab(91,"cloudberry","fruit"));
        vocabHelper.insertData(new Vocab(92,"coconut","fruit"));
        vocabHelper.insertData(new Vocab(93,"cranberry","fruit"));
        vocabHelper.insertData(new Vocab(94,"custard apple","fruit"));
        vocabHelper.insertData(new Vocab(95,"date palm","fruit"));
        vocabHelper.insertData(new Vocab(96,"dragon fruit","fruit"));
        vocabHelper.insertData(new Vocab(97,"durian","fruit"));
        vocabHelper.insertData(new Vocab(98,"elderberry","fruit"));

        vocabHelper.insertData(new Vocab(99,"fig","fruit"));
        vocabHelper.insertData(new Vocab(100,"grape","fruit"));
        vocabHelper.insertData(new Vocab(101,"grapefruit","fruit"));
        vocabHelper.insertData(new Vocab(102,"guava","fruit"));
        vocabHelper.insertData(new Vocab(103,"jackfruit","fruit"));
        vocabHelper.insertData(new Vocab(104,"jambul","fruit"));
        vocabHelper.insertData(new Vocab(105,"juniper berry","fruit"));
        vocabHelper.insertData(new Vocab(106,"jujube","fruit"));
        vocabHelper.insertData(new Vocab(107,"kiwi","fruit"));
        vocabHelper.insertData(new Vocab(108,"kumquat","fruit"));

        vocabHelper.insertData(new Vocab(109,"langsat","fruit"));
        vocabHelper.insertData(new Vocab(110,"longan","fruit"));
        vocabHelper.insertData(new Vocab(111,"lychee","fruit"));
        vocabHelper.insertData(new Vocab(112,"mango","fruit"));
        vocabHelper.insertData(new Vocab(113,"mangosteen","fruit"));
        vocabHelper.insertData(new Vocab(114,"marian plum","fruit"));
        vocabHelper.insertData(new Vocab(115,"melon","fruit"));
        vocabHelper.insertData(new Vocab(116,"miracle fruit","fruit"));
        vocabHelper.insertData(new Vocab(117,"mulberry","fruit"));
        vocabHelper.insertData(new Vocab(118,"nectarine","fruit"));

        vocabHelper.insertData(new Vocab(119,"olive","fruit"));
        vocabHelper.insertData(new Vocab(120,"orange","fruit"));
        vocabHelper.insertData(new Vocab(121,"papaya","fruit"));
        vocabHelper.insertData(new Vocab(122,"passionfruit","fruit"));
        vocabHelper.insertData(new Vocab(123,"peach","fruit"));
        vocabHelper.insertData(new Vocab(124,"pear","fruit"));
        vocabHelper.insertData(new Vocab(125,"persimmon","fruit"));
        vocabHelper.insertData(new Vocab(126,"pineapple","fruit"));
        vocabHelper.insertData(new Vocab(127,"plum","fruit"));
        vocabHelper.insertData(new Vocab(128,"pomegranate","fruit"));

        vocabHelper.insertData(new Vocab(129,"pomelo","fruit"));
        vocabHelper.insertData(new Vocab(130,"quince","fruit"));
        vocabHelper.insertData(new Vocab(131,"raspberry","fruit"));
        vocabHelper.insertData(new Vocab(132,"rambutan","fruit"));
        vocabHelper.insertData(new Vocab(133,"redcurrant","fruit"));
        vocabHelper.insertData(new Vocab(134,"rose apple","fruit"));
        vocabHelper.insertData(new Vocab(135,"salak","fruit"));
        vocabHelper.insertData(new Vocab(136,"santol","fruit"));
        vocabHelper.insertData(new Vocab(137,"sapodilla plum","fruit"));
        vocabHelper.insertData(new Vocab(138,"satsuma","fruit"));

        vocabHelper.insertData(new Vocab(139,"southern langsat","fruit"));
        vocabHelper.insertData(new Vocab(140,"star fruit","fruit"));
        vocabHelper.insertData(new Vocab(141,"star gooseberry","fruit"));
        vocabHelper.insertData(new Vocab(142,"strawberry","fruit"));
        vocabHelper.insertData(new Vocab(143,"tamarind","fruit"));
        vocabHelper.insertData(new Vocab(144,"yuzu","fruit"));

        //vegetable category
        vocabHelper.insertData(new Vocab(145,"acacia pennata","vegetable"));
        vocabHelper.insertData(new Vocab(146,"angled luffa","vegetable"));
        vocabHelper.insertData(new Vocab(147,"arugula","vegetable"));
        vocabHelper.insertData(new Vocab(148,"asparagus","vegetable"));
        vocabHelper.insertData(new Vocab(149,"baby corn","vegetable"));
        vocabHelper.insertData(new Vocab(150,"bamboo shoot","vegetable"));
        vocabHelper.insertData(new Vocab(151,"basil","vegetable"));
        vocabHelper.insertData(new Vocab(152,"bean","vegetable"));
        vocabHelper.insertData(new Vocab(153,"bean sprout","vegetable"));
        vocabHelper.insertData(new Vocab(154,"bell pepper","vegetable"));

        vocabHelper.insertData(new Vocab(155,"bird chilli","vegetable"));
        vocabHelper.insertData(new Vocab(156,"bitter melon","vegetable"));
        vocabHelper.insertData(new Vocab(157,"black bean ","vegetable"));
        vocabHelper.insertData(new Vocab(158,"black mushroom","vegetable"));
        vocabHelper.insertData(new Vocab(159,"bok choy","vegetable"));
        vocabHelper.insertData(new Vocab(160,"broccoli","vegetable"));
        vocabHelper.insertData(new Vocab(161,"Brussels sprout","vegetable"));
        vocabHelper.insertData(new Vocab(162,"cabbage","vegetable"));
        vocabHelper.insertData(new Vocab(163,"calabash","vegetable"));
        vocabHelper.insertData(new Vocab(164,"carrot","vegetable"));

        vocabHelper.insertData(new Vocab(165,"cashew nut","vegetable"));
        vocabHelper.insertData(new Vocab(166,"cassava","vegetable"));
        vocabHelper.insertData(new Vocab(167,"cauliflower","vegetable"));
        vocabHelper.insertData(new Vocab(168,"celery","vegetable"));
        vocabHelper.insertData(new Vocab(169,"chaplu leaf","vegetable"));
        vocabHelper.insertData(new Vocab(170,"chard","vegetable"));
        vocabHelper.insertData(new Vocab(171,"chayote","vegetable"));
        vocabHelper.insertData(new Vocab(172,"chili pepper","vegetable"));
        vocabHelper.insertData(new Vocab(173,"chilli","vegetable"));
        vocabHelper.insertData(new Vocab(174,"Chinese broccoli","vegetable"));

        vocabHelper.insertData(new Vocab(175,"Chinese cabbage","vegetable"));
        vocabHelper.insertData(new Vocab(176,"coriander","vegetable"));
        vocabHelper.insertData(new Vocab(177,"cucumber","vegetable"));
        vocabHelper.insertData(new Vocab(178,"culantro","vegetable"));
        vocabHelper.insertData(new Vocab(179,"dill","vegetable"));
        vocabHelper.insertData(new Vocab(180,"eggplant","vegetable"));
        vocabHelper.insertData(new Vocab(181,"enoki mushroom","vegetable"));
        vocabHelper.insertData(new Vocab(182,"fingerroot","vegetable"));
        vocabHelper.insertData(new Vocab(183,"galangal","vegetable"));
        vocabHelper.insertData(new Vocab(184,"garlic","vegetable"));

        vocabHelper.insertData(new Vocab(185,"ginger","vegetable"));
        vocabHelper.insertData(new Vocab(186,"goat pepper","vegetable"));
        vocabHelper.insertData(new Vocab(187,"gourd","vegetable"));
        vocabHelper.insertData(new Vocab(188,"green bean","vegetable"));
        vocabHelper.insertData(new Vocab(189,"green onion","vegetable"));
        vocabHelper.insertData(new Vocab(190,"hairy eggplant","vegetable"));
        vocabHelper.insertData(new Vocab(191,"holy basil","vegetable"));
        vocabHelper.insertData(new Vocab(192,"horse tamarind","vegetable"));
        vocabHelper.insertData(new Vocab(193,"ivy gourd","vegetable"));
        vocabHelper.insertData(new Vocab(194,"kaffir lime","vegetable"));

        vocabHelper.insertData(new Vocab(195,"kohlrabi","vegetable"));
        vocabHelper.insertData(new Vocab(196,"lemon","vegetable"));
        vocabHelper.insertData(new Vocab(197,"lemongrass","vegetable"));
        vocabHelper.insertData(new Vocab(198,"lettuce","vegetable"));
        vocabHelper.insertData(new Vocab(199,"lime","vegetable"));
        vocabHelper.insertData(new Vocab(200,"long bean","vegetable"));
        vocabHelper.insertData(new Vocab(201,"long eggplant","vegetable"));
        vocabHelper.insertData(new Vocab(202,"mung bean","vegetable"));
        vocabHelper.insertData(new Vocab(203,"mushroom","vegetable"));
        vocabHelper.insertData(new Vocab(204,"okra","vegetable"));

        vocabHelper.insertData(new Vocab(205,"onion","vegetable"));
        vocabHelper.insertData(new Vocab(206,"oyster mushrooms","vegetable"));
        vocabHelper.insertData(new Vocab(207,"parsley","vegetable"));
        vocabHelper.insertData(new Vocab(208,"pea","vegetable"));
        vocabHelper.insertData(new Vocab(209,"pea eggplant","vegetable"));
        vocabHelper.insertData(new Vocab(210,"peanut","vegetable"));
        vocabHelper.insertData(new Vocab(211,"pepper","vegetable"));
        vocabHelper.insertData(new Vocab(212,"peppermint","vegetable"));
        vocabHelper.insertData(new Vocab(213,"potato","vegetable"));
        vocabHelper.insertData(new Vocab(214,"pumpkin","vegetable"));

        vocabHelper.insertData(new Vocab(215,"radish","vegetable"));
        vocabHelper.insertData(new Vocab(216,"red bean","vegetable"));
        vocabHelper.insertData(new Vocab(217,"sesame","vegetable"));
        vocabHelper.insertData(new Vocab(218,"shallot","vegetable"));
        vocabHelper.insertData(new Vocab(219,"snake gourd","vegetable"));
        vocabHelper.insertData(new Vocab(220,"soybean","vegetable"));
        vocabHelper.insertData(new Vocab(221,"spinach","vegetable"));
        vocabHelper.insertData(new Vocab(222,"sponge gourd","vegetable"));
        vocabHelper.insertData(new Vocab(223,"straw mushroom","vegetable"));
        vocabHelper.insertData(new Vocab(224,"sweet basil","vegetable"));

        vocabHelper.insertData(new Vocab(225,"sweet pepper","vegetable"));
        vocabHelper.insertData(new Vocab(226,"taro","vegetable"));
        vocabHelper.insertData(new Vocab(227,"tomato","vegetable"));
        vocabHelper.insertData(new Vocab(228,"water mimosa","vegetable"));
        vocabHelper.insertData(new Vocab(229,"water spinach","vegetable"));
        vocabHelper.insertData(new Vocab(230,"watercress","vegetable"));
        vocabHelper.insertData(new Vocab(231,"winged bean","vegetable"));
        vocabHelper.insertData(new Vocab(232,"winter melon","vegetable"));
        vocabHelper.insertData(new Vocab(233,"yam","vegetable"));

        //animal category
        vocabHelper.insertData(new Vocab(234,"alligator","animal"));
        vocabHelper.insertData(new Vocab(235,"ant","animal"));
        vocabHelper.insertData(new Vocab(236,"bat","animal"));
        vocabHelper.insertData(new Vocab(237,"bear","animal"));
        vocabHelper.insertData(new Vocab(238,"bee","animal"));
        vocabHelper.insertData(new Vocab(239,"bird","animal"));
        vocabHelper.insertData(new Vocab(240,"bison","animal"));
        vocabHelper.insertData(new Vocab(241,"buffalo","animal"));
        vocabHelper.insertData(new Vocab(242,"butterfly","animal"));
        vocabHelper.insertData(new Vocab(243,"camel","animal"));

        vocabHelper.insertData(new Vocab(244,"cat","animal"));
        vocabHelper.insertData(new Vocab(245,"centipede","animal"));
        vocabHelper.insertData(new Vocab(246,"cheetah","animal"));
        vocabHelper.insertData(new Vocab(247,"chicken","animal"));
        vocabHelper.insertData(new Vocab(248,"chimpanzee","animal"));
        vocabHelper.insertData(new Vocab(249,"cobra","animal"));
        vocabHelper.insertData(new Vocab(250,"cockroach","animal"));
        vocabHelper.insertData(new Vocab(251,"cow","animal"));
        vocabHelper.insertData(new Vocab(252,"crab","animal"));
        vocabHelper.insertData(new Vocab(253,"crocodile","animal"));

        vocabHelper.insertData(new Vocab(254,"deer","animal"));
        vocabHelper.insertData(new Vocab(255,"dog","animal"));
        vocabHelper.insertData(new Vocab(256,"donkey","animal"));
        vocabHelper.insertData(new Vocab(257,"dragonfly","animal"));
        vocabHelper.insertData(new Vocab(258,"duck","animal"));
        vocabHelper.insertData(new Vocab(259,"eagle","animal"));
        vocabHelper.insertData(new Vocab(260,"earthworm","animal"));
        vocabHelper.insertData(new Vocab(261,"elephant","animal"));
        vocabHelper.insertData(new Vocab(262,"fish","animal"));
        vocabHelper.insertData(new Vocab(263,"fly","animal"));

        vocabHelper.insertData(new Vocab(264,"fox","animal"));
        vocabHelper.insertData(new Vocab(265,"frog","animal"));
        vocabHelper.insertData(new Vocab(266,"gecko","animal"));
        vocabHelper.insertData(new Vocab(267,"gibbon","animal"));
        vocabHelper.insertData(new Vocab(268,"giraffe","animal"));
        vocabHelper.insertData(new Vocab(269,"goat","animal"));
        vocabHelper.insertData(new Vocab(270,"goldfish","animal"));
        vocabHelper.insertData(new Vocab(271,"goose","animal"));
        vocabHelper.insertData(new Vocab(272,"gorilla","animal"));
        vocabHelper.insertData(new Vocab(273,"grasshopper","animal"));

        vocabHelper.insertData(new Vocab(274,"hamster","animal"));
        vocabHelper.insertData(new Vocab(275,"hawk","animal"));
        vocabHelper.insertData(new Vocab(276,"hen","animal"));
        vocabHelper.insertData(new Vocab(277,"hippopotamus","animal"));
        vocabHelper.insertData(new Vocab(278,"hornet","animal"));
        vocabHelper.insertData(new Vocab(279,"horse","animal"));
        vocabHelper.insertData(new Vocab(280,"kangaroo","animal"));
        vocabHelper.insertData(new Vocab(281,"kitty","animal"));
        vocabHelper.insertData(new Vocab(282,"koala","animal"));
        vocabHelper.insertData(new Vocab(283,"lion","animal"));

        vocabHelper.insertData(new Vocab(284,"lizard","animal"));
        vocabHelper.insertData(new Vocab(285,"monkey","animal"));
        vocabHelper.insertData(new Vocab(286,"mosquito","animal"));
        vocabHelper.insertData(new Vocab(287,"mouse","animal"));
        vocabHelper.insertData(new Vocab(288,"octopus","animal"));
        vocabHelper.insertData(new Vocab(289,"ostrich","animal"));
        vocabHelper.insertData(new Vocab(290,"owl","animal"));
        vocabHelper.insertData(new Vocab(291,"ox","animal"));
        vocabHelper.insertData(new Vocab(292,"panda","animal"));
        vocabHelper.insertData(new Vocab(293,"parrot","animal"));

        vocabHelper.insertData(new Vocab(294,"peacock","animal"));
        vocabHelper.insertData(new Vocab(295,"penguin","animal"));
        vocabHelper.insertData(new Vocab(296,"pig","animal"));
        vocabHelper.insertData(new Vocab(297,"piglet","animal"));
        vocabHelper.insertData(new Vocab(298,"polar bear","animal"));
        vocabHelper.insertData(new Vocab(299,"puppy","animal"));
        vocabHelper.insertData(new Vocab(300,"rabbit","animal"));
        vocabHelper.insertData(new Vocab(301,"rat","animal"));
        vocabHelper.insertData(new Vocab(302,"rhinoceros","animal"));
        vocabHelper.insertData(new Vocab(303,"rooster","animal"));

        vocabHelper.insertData(new Vocab(304,"scorpion","animal"));
        vocabHelper.insertData(new Vocab(305,"seahorse","animal"));
        vocabHelper.insertData(new Vocab(306,"seal ","animal"));
        vocabHelper.insertData(new Vocab(307,"shark","animal"));
        vocabHelper.insertData(new Vocab(308,"sheep","animal"));
        vocabHelper.insertData(new Vocab(309,"snake","animal"));
        vocabHelper.insertData(new Vocab(310,"spider","animal"));
        vocabHelper.insertData(new Vocab(311,"starfish","animal"));
        vocabHelper.insertData(new Vocab(312,"squid","animal"));
        vocabHelper.insertData(new Vocab(313,"tiger","animal"));

        vocabHelper.insertData(new Vocab(314,"toad","animal"));
        vocabHelper.insertData(new Vocab(315,"turkey","animal"));
        vocabHelper.insertData(new Vocab(316,"turtle","animal"));
        vocabHelper.insertData(new Vocab(317,"vulture","animal"));
        vocabHelper.insertData(new Vocab(318,"wasp","animal"));
        vocabHelper.insertData(new Vocab(319,"whale","animal"));
        vocabHelper.insertData(new Vocab(320,"wolf","animal"));
        vocabHelper.insertData(new Vocab(321,"worm","animal"));
        vocabHelper.insertData(new Vocab(322,"zebra","animal"));

        //place category
        vocabHelper.insertData(new Vocab(323,"airport","place"));
        vocabHelper.insertData(new Vocab(324,"antique shop","place"));
        vocabHelper.insertData(new Vocab(325,"bank","place"));
        vocabHelper.insertData(new Vocab(326,"bakery","place"));
        vocabHelper.insertData(new Vocab(327,"beauty salon","place"));
        vocabHelper.insertData(new Vocab(328,"barber shop","place"));
        vocabHelper.insertData(new Vocab(329,"beach","place"));
        vocabHelper.insertData(new Vocab(330,"bookstore","place"));
        vocabHelper.insertData(new Vocab(331,"bus station","place"));
        vocabHelper.insertData(new Vocab(332,"bus terminal","place"));

        vocabHelper.insertData(new Vocab(333,"cafeteria","place"));
        vocabHelper.insertData(new Vocab(334,"capital","place"));
        vocabHelper.insertData(new Vocab(335,"car park","place"));
        vocabHelper.insertData(new Vocab(336,"church","place"));
        vocabHelper.insertData(new Vocab(337,"cinema","place"));
        vocabHelper.insertData(new Vocab(338,"city","place"));
        vocabHelper.insertData(new Vocab(339,"coffee shop","place"));
        vocabHelper.insertData(new Vocab(340,"college","place"));
        vocabHelper.insertData(new Vocab(341,"continent","place"));
        vocabHelper.insertData(new Vocab(342,"clothing store","place"));

        vocabHelper.insertData(new Vocab(343,"department store","place"));
        vocabHelper.insertData(new Vocab(344,"factory","place"));
        vocabHelper.insertData(new Vocab(345,"filling station","place"));
        vocabHelper.insertData(new Vocab(346,"flower shop","place"));
        vocabHelper.insertData(new Vocab(347,"harbour","place"));
        vocabHelper.insertData(new Vocab(348,"hospital","place"));
        vocabHelper.insertData(new Vocab(349,"hotel","place"));
        vocabHelper.insertData(new Vocab(350,"lake","place"));
        vocabHelper.insertData(new Vocab(351,"laundry","place"));
        vocabHelper.insertData(new Vocab(352,"library","place"));

        vocabHelper.insertData(new Vocab(353,"market","place"));
        vocabHelper.insertData(new Vocab(354,"museum","place"));
        vocabHelper.insertData(new Vocab(355,"office","place"));
        vocabHelper.insertData(new Vocab(356,"gas station","place"));
        vocabHelper.insertData(new Vocab(357,"pet store","place"));
        vocabHelper.insertData(new Vocab(358,"police station","place"));
        vocabHelper.insertData(new Vocab(359,"post office","place"));
        vocabHelper.insertData(new Vocab(360,"public park","place"));
        vocabHelper.insertData(new Vocab(361,"railway station","place"));
        vocabHelper.insertData(new Vocab(362,"restaurant","place"));

        vocabHelper.insertData(new Vocab(363,"sea","place"));
        vocabHelper.insertData(new Vocab(364,"school","place"));
        vocabHelper.insertData(new Vocab(365,"supermarket","place"));
        vocabHelper.insertData(new Vocab(366,"swimming pool","place"));
        vocabHelper.insertData(new Vocab(367,"television station","place"));
        vocabHelper.insertData(new Vocab(368,"temple","place"));
        vocabHelper.insertData(new Vocab(369,"theater","place"));
        vocabHelper.insertData(new Vocab(370,"university","place"));
        vocabHelper.insertData(new Vocab(371,"village","place"));
        vocabHelper.insertData(new Vocab(372,"zoo","place"));

        //routine category
        vocabHelper.insertData(new Vocab(373,"wake up","routine"));
        vocabHelper.insertData(new Vocab(374,"get up","routine"));
        vocabHelper.insertData(new Vocab(375,"make a bed","routine"));
        vocabHelper.insertData(new Vocab(376,"brush my teeth","routine"));
        vocabHelper.insertData(new Vocab(377,"wash my face","routine"));
        vocabHelper.insertData(new Vocab(378,"take a bath","routine"));
        vocabHelper.insertData(new Vocab(379,"take a shower","routine"));
        vocabHelper.insertData(new Vocab(380,"get dressed","routine"));
        vocabHelper.insertData(new Vocab(381,"have breakfast","routine"));
        vocabHelper.insertData(new Vocab(382,"go to school","routine"));

        vocabHelper.insertData(new Vocab(383,"go to work","routine"));
        vocabHelper.insertData(new Vocab(384,"take a bus","routine"));
        vocabHelper.insertData(new Vocab(385,"take a train","routine"));
        vocabHelper.insertData(new Vocab(386,"get to school","routine"));
        vocabHelper.insertData(new Vocab(387,"study","routine"));
        vocabHelper.insertData(new Vocab(388,"eat lunch","routine"));
        vocabHelper.insertData(new Vocab(389,"go home","routine"));
        vocabHelper.insertData(new Vocab(390,"get home","routine"));
        vocabHelper.insertData(new Vocab(391,"do homework","routine"));
        vocabHelper.insertData(new Vocab(392,"eat dinner","routine"));

        vocabHelper.insertData(new Vocab(393,"watch TV","routine"));
        vocabHelper.insertData(new Vocab(394,"listen to music","routine"));
        vocabHelper.insertData(new Vocab(395,"go to bed","routine"));

        //drink category
        vocabHelper.insertData(new Vocab(396,"tea","drink"));
        vocabHelper.insertData(new Vocab(397,"iced tea","drink"));
        vocabHelper.insertData(new Vocab(398,"fruit tea","drink"));
        vocabHelper.insertData(new Vocab(399,"herbal tea","drink"));
        vocabHelper.insertData(new Vocab(400,"green tea","drink"));
        vocabHelper.insertData(new Vocab(401,"black tea","drink"));
        vocabHelper.insertData(new Vocab(402,"hot chocolate","drink"));
        vocabHelper.insertData(new Vocab(403,"water","drink"));
        vocabHelper.insertData(new Vocab(404,"mineral water","drink"));
        vocabHelper.insertData(new Vocab(405,"tap water","drink"));

        vocabHelper.insertData(new Vocab(406,"coffee","drink"));
        vocabHelper.insertData(new Vocab(407,"iced coffee","drink"));
        vocabHelper.insertData(new Vocab(408,"black coffee","drink"));
        vocabHelper.insertData(new Vocab(409,"decaffeinated coffee","drink"));
        vocabHelper.insertData(new Vocab(410,"latte","drink"));
        vocabHelper.insertData(new Vocab(411,"cappuccino","drink"));
        vocabHelper.insertData(new Vocab(412,"mocha","drink"));
        vocabHelper.insertData(new Vocab(413,"macchiato","drink"));
        vocabHelper.insertData(new Vocab(414,"americano","drink"));
        vocabHelper.insertData(new Vocab(415,"alcohol","drink"));

        vocabHelper.insertData(new Vocab(416,"beer","drink"));
        vocabHelper.insertData(new Vocab(417,"brandy","drink"));
        vocabHelper.insertData(new Vocab(418,"champagne","drink"));
        vocabHelper.insertData(new Vocab(419,"cocoa","drink"));
        vocabHelper.insertData(new Vocab(420,"cocktail","drink"));
        vocabHelper.insertData(new Vocab(421,"cola","drink"));
        vocabHelper.insertData(new Vocab(422,"gin","drink"));
        vocabHelper.insertData(new Vocab(423,"juice","drink"));
        vocabHelper.insertData(new Vocab(424,"bael fruit juice","drink"));
        vocabHelper.insertData(new Vocab(425,"chrysanthemum juice","drink"));

        vocabHelper.insertData(new Vocab(426,"grape juice","drink"));
        vocabHelper.insertData(new Vocab(427,"lemonade","drink"));
        vocabHelper.insertData(new Vocab(428,"roselle juice","drink"));
        vocabHelper.insertData(new Vocab(429,"tamarind juice","drink"));
        vocabHelper.insertData(new Vocab(430,"yellow plum juice","drink"));
        vocabHelper.insertData(new Vocab(431,"liquor","drink"));
        vocabHelper.insertData(new Vocab(432,"martini","drink"));
        vocabHelper.insertData(new Vocab(433,"milk","drink"));
        vocabHelper.insertData(new Vocab(434,"milkshake","drink"));
        vocabHelper.insertData(new Vocab(435,"mocktail","drink"));

        vocabHelper.insertData(new Vocab(436,"orange juice","drink"));
        vocabHelper.insertData(new Vocab(437,"punch","drink"));
        vocabHelper.insertData(new Vocab(438,"smoothie","drink"));
        vocabHelper.insertData(new Vocab(439,"soda","drink"));
        vocabHelper.insertData(new Vocab(440,"soft drink","drink"));
        vocabHelper.insertData(new Vocab(441,"squash","drink"));
        vocabHelper.insertData(new Vocab(442,"tequila","drink"));
        vocabHelper.insertData(new Vocab(443,"tomato juice","drink"));
        vocabHelper.insertData(new Vocab(444,"tonic","drink"));
        vocabHelper.insertData(new Vocab(445,"vodka","drink"));

        vocabHelper.insertData(new Vocab(446,"whiskey","drink"));
        vocabHelper.insertData(new Vocab(447,"wine","drink"));
        vocabHelper.insertData(new Vocab(448,"rum","drink"));

        //sport category
        vocabHelper.insertData(new Vocab(449,"archery","sport"));
        vocabHelper.insertData(new Vocab(450,"american football","sport"));
        vocabHelper.insertData(new Vocab(451,"athletics","sport"));
        vocabHelper.insertData(new Vocab(452,"badminton","sport"));
        vocabHelper.insertData(new Vocab(453,"baseball","sport"));
        vocabHelper.insertData(new Vocab(454,"basketball","sport"));
        vocabHelper.insertData(new Vocab(455,"billiards","sport"));
        vocabHelper.insertData(new Vocab(456,"bowling","sport"));
        vocabHelper.insertData(new Vocab(457,"boxing","sport"));
        vocabHelper.insertData(new Vocab(458,"canoe","sport"));

        vocabHelper.insertData(new Vocab(459,"cricket","sport"));
        vocabHelper.insertData(new Vocab(460,"chess","sport"));
        vocabHelper.insertData(new Vocab(461,"climbing","sport"));
        vocabHelper.insertData(new Vocab(462,"cycling","sport"));
        vocabHelper.insertData(new Vocab(463,"darts","sport"));
        vocabHelper.insertData(new Vocab(464,"diving","sport"));
        vocabHelper.insertData(new Vocab(465,"fencing","sport"));
        vocabHelper.insertData(new Vocab(466,"fishing","sport"));
        vocabHelper.insertData(new Vocab(467,"football","sport"));
        vocabHelper.insertData(new Vocab(468,"gymnastics","sport"));

        vocabHelper.insertData(new Vocab(469,"handball","sport"));
        vocabHelper.insertData(new Vocab(470,"high jump","sport"));
        vocabHelper.insertData(new Vocab(471,"hockey","sport"));
        vocabHelper.insertData(new Vocab(472,"horse racing","sport"));
        vocabHelper.insertData(new Vocab(473,"ice skating","sport"));
        vocabHelper.insertData(new Vocab(474,"judo","sport"));
        vocabHelper.insertData(new Vocab(475,"polo","sport"));
        vocabHelper.insertData(new Vocab(476,"karate","sport"));
        vocabHelper.insertData(new Vocab(477,"long jump","sport"));
        vocabHelper.insertData(new Vocab(478,"car racing","sport"));

        vocabHelper.insertData(new Vocab(479,"running","sport"));
        vocabHelper.insertData(new Vocab(480,"rugby","sport"));
        vocabHelper.insertData(new Vocab(481,"sailing","sport"));
        vocabHelper.insertData(new Vocab(482,"softball","sport"));
        vocabHelper.insertData(new Vocab(483,"shooting","sport"));
        vocabHelper.insertData(new Vocab(484,"skateboarding","sport"));
        vocabHelper.insertData(new Vocab(485,"skating","sport"));
        vocabHelper.insertData(new Vocab(486,"skiing","sport"));
        vocabHelper.insertData(new Vocab(487,"skydive","sport"));
        vocabHelper.insertData(new Vocab(488,"sqaush","sport"));

        vocabHelper.insertData(new Vocab(489,"snooker","sport"));
        vocabHelper.insertData(new Vocab(490,"surfing","sport"));
        vocabHelper.insertData(new Vocab(491,"snowboarding","sport"));
        vocabHelper.insertData(new Vocab(492,"swimming","sport"));
        vocabHelper.insertData(new Vocab(493,"table tennis","sport"));
        vocabHelper.insertData(new Vocab(494,"tennis","sport"));
        vocabHelper.insertData(new Vocab(495,"taekwondo","sport"));
        vocabHelper.insertData(new Vocab(496,"volleyball","sport"));
        vocabHelper.insertData(new Vocab(497,"water polo","sport"));
        vocabHelper.insertData(new Vocab(498,"water skiing","sport"));

        vocabHelper.insertData(new Vocab(499,"weightlifting","sport"));
        vocabHelper.insertData(new Vocab(500,"wrestling","sport"));

        //festival category
        vocabHelper.insertData(new Vocab(501,"Father’s Days","festival"));
        vocabHelper.insertData(new Vocab(502,"Mother’s Day","festival"));
        vocabHelper.insertData(new Vocab(503,"Children’s Day","festival"));
        vocabHelper.insertData(new Vocab(504,"Teacher’s Day","festival"));
        vocabHelper.insertData(new Vocab(505,"Makha Puja Day","festival"));
        vocabHelper.insertData(new Vocab(506,"Visakha Puja Day","festival"));
        vocabHelper.insertData(new Vocab(507,"Asalha Puja Day","festival"));
        vocabHelper.insertData(new Vocab(508,"Chakri Day","festival"));
        vocabHelper.insertData(new Vocab(509,"King Chulalongkorn Day","festival"));
        vocabHelper.insertData(new Vocab(510,"Coronation Day","festival"));

        vocabHelper.insertData(new Vocab(511,"The Plowing Ceremony Day","festival"));
        vocabHelper.insertData(new Vocab(512,"Labor Day","festival"));
        vocabHelper.insertData(new Vocab(513,"Constitution Day","festival"));
        vocabHelper.insertData(new Vocab(514,"Loy Krathong Day","festival"));
        vocabHelper.insertData(new Vocab(515,"Songkran Day","festival"));
        vocabHelper.insertData(new Vocab(516,"Chinese New Year’s Day","festival"));
        vocabHelper.insertData(new Vocab(517,"Moon Festival","festival"));
        vocabHelper.insertData(new Vocab(518,"Easter Day","festival"));
        vocabHelper.insertData(new Vocab(519,"Thanksgiving Day","festival"));
        vocabHelper.insertData(new Vocab(520,"Halloween Day","festival"));

        vocabHelper.insertData(new Vocab(521,"Valentine’s day","festival"));
        vocabHelper.insertData(new Vocab(522,"Christmas Eve","festival"));
        vocabHelper.insertData(new Vocab(523,"Christmas Day","festival"));
        vocabHelper.insertData(new Vocab(524,"New Year’s Eve","festival"));
        vocabHelper.insertData(new Vocab(525,"New Year’s Day","festival"));
        vocabHelper.insertData(new Vocab(526,"Vegetarian Festival","festival"));
        vocabHelper.insertData(new Vocab(527,"Rocket Festival","festival"));
        vocabHelper.insertData(new Vocab(528,"Candle Festival","festival"));
        vocabHelper.insertData(new Vocab(529,"Chinese Lunar Day","festival"));
        vocabHelper.insertData(new Vocab(530,"National Sport’s Day","festival"));

        vocabHelper.insertData(new Vocab(531,"National Artist Day","festival"));
        vocabHelper.insertData(new Vocab(532,"World No Tobacco Day","festival"));
        vocabHelper.insertData(new Vocab(533,"Buddhist lent day ","festival"));
        vocabHelper.insertData(new Vocab(534,"End of Buddhist lent day","festival"));
        vocabHelper.insertData(new Vocab(535,"Earth Day","festival"));
        vocabHelper.insertData(new Vocab(536,"International Women's Day","festival"));

        //Asian Countries
        vocabHelper.insertData(new Vocab(537,"Afghanistan","Asian Countries"));
        vocabHelper.insertData(new Vocab(538,"Armenia","Asian Countries"));
        vocabHelper.insertData(new Vocab(539,"Azerbaijan","Asian Countries"));
        vocabHelper.insertData(new Vocab(540,"Bahrain","Asian Countries"));
        vocabHelper.insertData(new Vocab(541,"Bangladesh","Asian Countries"));
        vocabHelper.insertData(new Vocab(542,"Bhutan","Asian Countries"));
        vocabHelper.insertData(new Vocab(543,"Brunei","Asian Countries"));
        vocabHelper.insertData(new Vocab(544,"Cambodia","Asian Countries"));
        vocabHelper.insertData(new Vocab(545,"China","Asian Countries"));
        vocabHelper.insertData(new Vocab(546,"Cyprus","Asian Countries"));

        vocabHelper.insertData(new Vocab(547,"Georgia","Asian Countries"));
        vocabHelper.insertData(new Vocab(548,"India","Asian Countries"));
        vocabHelper.insertData(new Vocab(549,"Indonesia","Asian Countries"));
        vocabHelper.insertData(new Vocab(550,"Iran","Asian Countries"));
        vocabHelper.insertData(new Vocab(551,"Iraq","Asian Countries"));
        vocabHelper.insertData(new Vocab(552,"Israel","Asian Countries"));
        vocabHelper.insertData(new Vocab(553,"Japan","Asian Countries"));
        vocabHelper.insertData(new Vocab(554,"Jordan","Asian Countries"));
        vocabHelper.insertData(new Vocab(555,"Kazakhstan","Asian Countries"));
        vocabHelper.insertData(new Vocab(556,"Kuwait","Asian Countries"));

        vocabHelper.insertData(new Vocab(557,"Kyrgyzstan","Asian Countries"));
        vocabHelper.insertData(new Vocab(558,"Laos","Asian Countries"));
        vocabHelper.insertData(new Vocab(559,"Lebanon","Asian Countries"));
        vocabHelper.insertData(new Vocab(560,"Malaysia","Asian Countries"));
        vocabHelper.insertData(new Vocab(561,"Maldives","Asian Countries"));
        vocabHelper.insertData(new Vocab(562,"Mongolia","Asian Countries"));
        vocabHelper.insertData(new Vocab(563,"Myanmar","Asian Countries"));
        vocabHelper.insertData(new Vocab(564,"Nepal","Asian Countries"));
        vocabHelper.insertData(new Vocab(565,"North Korea","Asian Countries"));
        vocabHelper.insertData(new Vocab(566,"Oman","Asian Countries"));

        vocabHelper.insertData(new Vocab(567,"Pakistan","Asian Countries"));
        vocabHelper.insertData(new Vocab(568,"Palestine","Asian Countries"));
        vocabHelper.insertData(new Vocab(569,"Philippines","Asian Countries"));
        vocabHelper.insertData(new Vocab(570,"Qatar","Asian Countries"));
        vocabHelper.insertData(new Vocab(571,"Saudi Arabia","Asian Countries"));
        vocabHelper.insertData(new Vocab(572,"Singapore","Asian Countries"));
        vocabHelper.insertData(new Vocab(573,"South Korea","Asian Countries"));
        vocabHelper.insertData(new Vocab(574,"Sri Lanka","Asian Countries"));
        vocabHelper.insertData(new Vocab(575,"Syria","Asian Countries"));
        vocabHelper.insertData(new Vocab(576,"Tajikistan","Asian Countries"));

        vocabHelper.insertData(new Vocab(577,"Thailand","Asian Countries"));
        vocabHelper.insertData(new Vocab(578,"Timor-Leste","Asian Countries"));
        vocabHelper.insertData(new Vocab(579,"Turkey","Asian Countries"));
        vocabHelper.insertData(new Vocab(580,"Turkmenistan","Asian Countries"));
        vocabHelper.insertData(new Vocab(581,"United Arab Emirates","Asian Countries"));
        vocabHelper.insertData(new Vocab(582,"Uzbekistan","Asian Countries"));
        vocabHelper.insertData(new Vocab(583,"Vietnam","Asian Countries"));
        vocabHelper.insertData(new Vocab(584,"Yemen","Asian Countries"));

        //European Countries
        vocabHelper.insertData(new Vocab(585,"Albania","European Countries"));
        vocabHelper.insertData(new Vocab(586,"Andorra","European Countries"));
        vocabHelper.insertData(new Vocab(587,"Austria","European Countries"));
        vocabHelper.insertData(new Vocab(588,"Belarus","European Countries"));
        vocabHelper.insertData(new Vocab(589,"Belgium","European Countries"));
        vocabHelper.insertData(new Vocab(590,"Bosnia and Herzegovina","European Countries"));
        vocabHelper.insertData(new Vocab(591,"Bulgaria","European Countries"));
        vocabHelper.insertData(new Vocab(592,"Croatia","European Countries"));
        vocabHelper.insertData(new Vocab(593,"Czech Republic","European Countries"));
        vocabHelper.insertData(new Vocab(594,"Denmark","European Countries"));

        vocabHelper.insertData(new Vocab(595,"Estonia","European Countries"));
        vocabHelper.insertData(new Vocab(596,"Finland","European Countries"));
        vocabHelper.insertData(new Vocab(597,"France","European Countries"));
        vocabHelper.insertData(new Vocab(598,"Germany","European Countries"));
        vocabHelper.insertData(new Vocab(599,"Greece","European Countries"));
        vocabHelper.insertData(new Vocab(600,"Hungary","European Countries"));
        vocabHelper.insertData(new Vocab(601,"Iceland","European Countries"));
        vocabHelper.insertData(new Vocab(602,"Ireland","European Countries"));
        vocabHelper.insertData(new Vocab(603,"Italy","European Countries"));
        vocabHelper.insertData(new Vocab(604,"Kosovo","European Countries"));

        vocabHelper.insertData(new Vocab(605,"Latvia","European Countries"));
        vocabHelper.insertData(new Vocab(606,"Liechtenstein","European Countries"));
        vocabHelper.insertData(new Vocab(607,"Lithuania","European Countries"));
        vocabHelper.insertData(new Vocab(608,"Luxembourg","European Countries"));
        vocabHelper.insertData(new Vocab(609,"Macedonia","European Countries"));
        vocabHelper.insertData(new Vocab(610,"Malta","European Countries"));
        vocabHelper.insertData(new Vocab(611,"Moldova","European Countries"));
        vocabHelper.insertData(new Vocab(612,"Monaco","European Countries"));
        vocabHelper.insertData(new Vocab(613,"Montenegro","European Countries"));
        vocabHelper.insertData(new Vocab(614,"Netherlands","European Countries"));

        vocabHelper.insertData(new Vocab(615,"Norway","European Countries"));
        vocabHelper.insertData(new Vocab(616,"Poland","European Countries"));
        vocabHelper.insertData(new Vocab(617,"Portugal","European Countries"));
        vocabHelper.insertData(new Vocab(618,"Romania","European Countries"));
        vocabHelper.insertData(new Vocab(619,"Russia","European Countries"));
        vocabHelper.insertData(new Vocab(620,"San Marino","European Countries"));
        vocabHelper.insertData(new Vocab(621,"Serbia","European Countries"));
        vocabHelper.insertData(new Vocab(622,"Slovakia","European Countries"));
        vocabHelper.insertData(new Vocab(623,"Slovenia","European Countries"));
        vocabHelper.insertData(new Vocab(624,"Spain","European Countries"));

        vocabHelper.insertData(new Vocab(625,"Sweden","European Countries"));
        vocabHelper.insertData(new Vocab(626,"Switzerland","European Countries"));
        vocabHelper.insertData(new Vocab(627,"Ukraine","European Countries"));
        vocabHelper.insertData(new Vocab(628,"United Kingdom","European Countries"));
        vocabHelper.insertData(new Vocab(629,"Vatican City","European Countries"));

        //family category

        vocabHelper.insertData(new Vocab(630,"aunt","family"));
        vocabHelper.insertData(new Vocab(631,"baby brother","family"));
        vocabHelper.insertData(new Vocab(632,"baby sister","family"));
        vocabHelper.insertData(new Vocab(633,"brother","family"));
        vocabHelper.insertData(new Vocab(634,"brother-in-law","family"));
        vocabHelper.insertData(new Vocab(635,"cousin","family"));
        vocabHelper.insertData(new Vocab(636,"dad","family"));
        vocabHelper.insertData(new Vocab(637,"daddy","family"));
        vocabHelper.insertData(new Vocab(638,"daughter","family"));
        vocabHelper.insertData(new Vocab(639,"daughter-in-law","family"));

        vocabHelper.insertData(new Vocab(640,"elder brother","family"));
        vocabHelper.insertData(new Vocab(641,"elder sister","family"));
        vocabHelper.insertData(new Vocab(642,"father","family"));
        vocabHelper.insertData(new Vocab(643,"father-in-law","family"));
        vocabHelper.insertData(new Vocab(644,"grandchild","family"));
        vocabHelper.insertData(new Vocab(645,"granddaughter","family"));
        vocabHelper.insertData(new Vocab(646,"grandfather","family"));
        vocabHelper.insertData(new Vocab(647,"grandma","family"));
        vocabHelper.insertData(new Vocab(648,"grandmother","family"));
        vocabHelper.insertData(new Vocab(649,"grandpa","family"));

        vocabHelper.insertData(new Vocab(650,"grandparents","family"));
        vocabHelper.insertData(new Vocab(651,"grandson","family"));
        vocabHelper.insertData(new Vocab(652,"great grandchild","family"));
        vocabHelper.insertData(new Vocab(653,"great granddaughter","family"));
        vocabHelper.insertData(new Vocab(654,"great grandfather","family"));
        vocabHelper.insertData(new Vocab(655,"great grandmother","family"));
        vocabHelper.insertData(new Vocab(656,"great grandson","family"));
        vocabHelper.insertData(new Vocab(657,"husband","family"));
        vocabHelper.insertData(new Vocab(658,"mom","family"));
        vocabHelper.insertData(new Vocab(659,"mommy","family"));

        vocabHelper.insertData(new Vocab(660,"mother","family"));
        vocabHelper.insertData(new Vocab(661,"mother-in-law","family"));
        vocabHelper.insertData(new Vocab(662,"mum","family"));
        vocabHelper.insertData(new Vocab(663,"mummy","family"));
        vocabHelper.insertData(new Vocab(664,"nephew","family"));
        vocabHelper.insertData(new Vocab(665,"niece","family"));
        vocabHelper.insertData(new Vocab(666,"parents","family"));
        vocabHelper.insertData(new Vocab(667,"siblings","family"));
        vocabHelper.insertData(new Vocab(668,"sister","family"));
        vocabHelper.insertData(new Vocab(669,"sister-in-law","family"));

        vocabHelper.insertData(new Vocab(670,"son","family"));
        vocabHelper.insertData(new Vocab(671,"son-in-law","family"));
        vocabHelper.insertData(new Vocab(672,"stepbrother","family"));
        vocabHelper.insertData(new Vocab(673,"stepdaughter","family"));
        vocabHelper.insertData(new Vocab(674,"stepfather","family"));
        vocabHelper.insertData(new Vocab(675,"stepmother","family"));
        vocabHelper.insertData(new Vocab(676,"stepsister","family"));
        vocabHelper.insertData(new Vocab(677,"stepson","family"));
        vocabHelper.insertData(new Vocab(678,"uncle","family"));
        vocabHelper.insertData(new Vocab(679,"wife","family"));

        vocabHelper.insertData(new Vocab(680,"younger brother","family"));
        vocabHelper.insertData(new Vocab(681,"younger sister","family"));

        //universe category
        vocabHelper.insertData(new Vocab(682,"Aerosols","universe"));
        vocabHelper.insertData(new Vocab(683,"Acoustic waves","universe"));
        vocabHelper.insertData(new Vocab(684,"alien","universe"));
        vocabHelper.insertData(new Vocab(685,"Asterism","universe"));
        vocabHelper.insertData(new Vocab(686,"Asteroid belt","universe"));
        vocabHelper.insertData(new Vocab(687,"Asteroids","universe"));
        vocabHelper.insertData(new Vocab(688,"Astronomical unit","universe"));
        vocabHelper.insertData(new Vocab(689,"astronaut","universe"));
        vocabHelper.insertData(new Vocab(690,"Astronomy","universe"));
        vocabHelper.insertData(new Vocab(691,"Atmosphere","universe"));

        vocabHelper.insertData(new Vocab(692,"Aurora","universe"));
        vocabHelper.insertData(new Vocab(693,"Basin impact","universe"));
        vocabHelper.insertData(new Vocab(694,"Binary star system","universe"));
        vocabHelper.insertData(new Vocab(695,"Black dwarf","universe"));
        vocabHelper.insertData(new Vocab(696,"Black Hole","universe"));
        vocabHelper.insertData(new Vocab(697,"Brightest star","universe"));
        vocabHelper.insertData(new Vocab(698,"Brown dwarf","universe"));
        vocabHelper.insertData(new Vocab(699,"Carbon star","universe"));
        vocabHelper.insertData(new Vocab(700,"Chalawan star","universe"));
        vocabHelper.insertData(new Vocab(701,"Center of The Milky Way","universe"));

        vocabHelper.insertData(new Vocab(702,"Cluster of Galaxies","universe"));
        vocabHelper.insertData(new Vocab(703,"Comet","universe"));
        vocabHelper.insertData(new Vocab(704,"Convection Zone","universe"));
        vocabHelper.insertData(new Vocab(705,"Constellations","universe"));
        vocabHelper.insertData(new Vocab(706,"Cosmic ray","universe"));
        vocabHelper.insertData(new Vocab(707,"Crater","universe"));
        vocabHelper.insertData(new Vocab(708,"Cryovolcanoes","universe"));
        vocabHelper.insertData(new Vocab(709,"Dark Nebula","universe"));
        vocabHelper.insertData(new Vocab(710,"Disk Galaxy","universe"));
        vocabHelper.insertData(new Vocab(711,"Dust","universe"));

        vocabHelper.insertData(new Vocab(712,"Dwarf galaxy","universe"));
        vocabHelper.insertData(new Vocab(713,"Dwarf star","universe"));
        vocabHelper.insertData(new Vocab(714,"Dwarf planet","universe"));
        vocabHelper.insertData(new Vocab(715,"earth","universe"));
        vocabHelper.insertData(new Vocab(716,"Earth System","universe"));
        vocabHelper.insertData(new Vocab(717,"Electromagnetic Spectrum ","universe"));
        vocabHelper.insertData(new Vocab(718,"Evening star & Morning star","universe"));
        vocabHelper.insertData(new Vocab(719,"Extrasolar planet","universe"));
        vocabHelper.insertData(new Vocab(720,"First star","universe"));
        vocabHelper.insertData(new Vocab(721,"Fossil Groups","universe"));

        vocabHelper.insertData(new Vocab(722,"Galaxy","universe"));
        vocabHelper.insertData(new Vocab(723,"Galilean Moons","universe"));
        vocabHelper.insertData(new Vocab(724,"Giant planet","universe"));
        vocabHelper.insertData(new Vocab(725,"Host star","universe"));
        vocabHelper.insertData(new Vocab(726,"Ice giant planet","universe"));
        vocabHelper.insertData(new Vocab(727,"Ice ring","universe"));
        vocabHelper.insertData(new Vocab(728,"International Space Station","universe"));
        vocabHelper.insertData(new Vocab(729,"Jovian Planets","universe"));
        vocabHelper.insertData(new Vocab(730,"Jupiter","universe"));
        vocabHelper.insertData(new Vocab(731,"Kuiper betl","universe"));

        vocabHelper.insertData(new Vocab(732,"Light pollution","universe"));
        vocabHelper.insertData(new Vocab(733,"Light Year","universe"));
        vocabHelper.insertData(new Vocab(734,"Local group galaxy","universe"));
        vocabHelper.insertData(new Vocab(735,"Lunar Eclipse","universe"));
        vocabHelper.insertData(new Vocab(736,"Mars","universe"));
        vocabHelper.insertData(new Vocab(737,"Mars rover","universe"));
        vocabHelper.insertData(new Vocab(738,"Magnetic star","universe"));
        vocabHelper.insertData(new Vocab(739,"Mercury","universe"));
        vocabHelper.insertData(new Vocab(740,"meteor","universe"));
        vocabHelper.insertData(new Vocab(741,"Meteor shower","universe"));

        vocabHelper.insertData(new Vocab(742,"Meteorite","universe"));
        vocabHelper.insertData(new Vocab(743,"Milky Way Galaxy","universe"));
        vocabHelper.insertData(new Vocab(744,"Molecular clouds","universe"));
        vocabHelper.insertData(new Vocab(745,"Moon","universe"));
        vocabHelper.insertData(new Vocab(746,"Multiple star","universe"));
        vocabHelper.insertData(new Vocab(747,"Multiverse","universe"));
        vocabHelper.insertData(new Vocab(748,"Near Earth Asteroids","universe"));
        vocabHelper.insertData(new Vocab(749,"Nebula","universe"));
        vocabHelper.insertData(new Vocab(750,"Neutrino","universe"));
        vocabHelper.insertData(new Vocab(751,"Neutron Star","universe"));

        vocabHelper.insertData(new Vocab(752,"Nova","universe"));
        vocabHelper.insertData(new Vocab(753,"Neptune","universe"));
        vocabHelper.insertData(new Vocab(754,"orbit","universe"));
        vocabHelper.insertData(new Vocab(755,"Planetarium","universe"));
        vocabHelper.insertData(new Vocab(756,"Perihelion","universe"));
        vocabHelper.insertData(new Vocab(757,"Planet","universe"));
        vocabHelper.insertData(new Vocab(758,"Planetary wind","universe"));
        vocabHelper.insertData(new Vocab(759,"Plasma","universe"));
        vocabHelper.insertData(new Vocab(760,"rocket","universe"));
        vocabHelper.insertData(new Vocab(761,"radar","universe"));

        vocabHelper.insertData(new Vocab(762,"star","universe"));
        vocabHelper.insertData(new Vocab(763,"Saturn","universe"));
        vocabHelper.insertData(new Vocab(764,"solar system","universe"));
        vocabHelper.insertData(new Vocab(765,"satellite","universe"));
        vocabHelper.insertData(new Vocab(766,"Solar Eclipse","universe"));
        vocabHelper.insertData(new Vocab(767,"Solar wind","universe"));
        vocabHelper.insertData(new Vocab(768,"space shuttle","universe"));
        vocabHelper.insertData(new Vocab(769,"space station","universe"));
        vocabHelper.insertData(new Vocab(770,"Spacecraft","universe"));
        vocabHelper.insertData(new Vocab(771,"Space Weather","universe"));

        vocabHelper.insertData(new Vocab(772,"Star cluster","universe"));
        vocabHelper.insertData(new Vocab(773,"Star wheel","universe"));
        vocabHelper.insertData(new Vocab(774,"Star-forming","universe"));
        vocabHelper.insertData(new Vocab(775,"Starburst galaxy","universe"));
        vocabHelper.insertData(new Vocab(776,"Stellar atmosphere","universe"));
        vocabHelper.insertData(new Vocab(777,"sun","universe"));
        vocabHelper.insertData(new Vocab(778,"Sunspot","universe"));
        vocabHelper.insertData(new Vocab(779,"Supermassive star","universe"));
        vocabHelper.insertData(new Vocab(780,"Super Earth size planet","universe"));
        vocabHelper.insertData(new Vocab(781,"telescope","universe"));

        vocabHelper.insertData(new Vocab(782,"Terrestrial Planets","universe"));
        vocabHelper.insertData(new Vocab(783,"Titanium dioxide Star","universe"));
        vocabHelper.insertData(new Vocab(784,"UFO","universe"));
        vocabHelper.insertData(new Vocab(785,"Universe","universe"));
        vocabHelper.insertData(new Vocab(786,"Uranus","universe"));
        vocabHelper.insertData(new Vocab(787,"Venus","universe"));
        vocabHelper.insertData(new Vocab(788,"White dwarf star","universe"));


        //traffic sign
        vocabHelper.insertData(new Vocab(789,"All Vehicles Prohibited","traffic sign"));
        vocabHelper.insertData(new Vocab(790,"Bike Lane","traffic sign"));
        vocabHelper.insertData(new Vocab(791,"Bus & Taxi","traffic sign"));
        vocabHelper.insertData(new Vocab(792,"Car Rental","traffic sign"));
        vocabHelper.insertData(new Vocab(793,"Caution Cliff Ahead","traffic sign"));
        vocabHelper.insertData(new Vocab(794,"Caution Poison","traffic sign"));
        vocabHelper.insertData(new Vocab(795,"Crossroads","traffic sign"));
        vocabHelper.insertData(new Vocab(796,"Danger High Voltage","traffic sign"));
        vocabHelper.insertData(new Vocab(797,"Dangerous Bend","traffic sign"));
        vocabHelper.insertData(new Vocab(798,"Dual Carriage Way End","traffic sign"));

        vocabHelper.insertData(new Vocab(799,"Exit","traffic sign"));
        vocabHelper.insertData(new Vocab(800,"Flooded","traffic sign"));
        vocabHelper.insertData(new Vocab(801,"Hump Bridge","traffic sign"));
        vocabHelper.insertData(new Vocab(802,"Left Winding Road","traffic sign"));
        vocabHelper.insertData(new Vocab(803,"Maze","traffic sign"));
        vocabHelper.insertData(new Vocab(804,"Narrow Bridge","traffic sign"));
        vocabHelper.insertData(new Vocab(805,"Narrow Road","traffic sign"));
        vocabHelper.insertData(new Vocab(806,"No Audible","traffic sign"));
        vocabHelper.insertData(new Vocab(807,"No Bikes","traffic sign"));
        vocabHelper.insertData(new Vocab(808,"No Double Parking","traffic sign"));

        vocabHelper.insertData(new Vocab(809,"No Entry","traffic sign"));
        vocabHelper.insertData(new Vocab(810,"No Over Taking","traffic sign"));
        vocabHelper.insertData(new Vocab(811,"No Parking","traffic sign"));
        vocabHelper.insertData(new Vocab(812,"No Passing Zone","traffic sign"));
        vocabHelper.insertData(new Vocab(813,"No Pedestrians","traffic sign"));
        vocabHelper.insertData(new Vocab(814,"No Standing and Parking","traffic sign"));
        vocabHelper.insertData(new Vocab(815,"No Turn Left","traffic sign"));
        vocabHelper.insertData(new Vocab(816,"No Turn Right","traffic sign"));
        vocabHelper.insertData(new Vocab(817,"No U – Turn","traffic sign"));
        vocabHelper.insertData(new Vocab(818,"One Way","traffic sign"));

        vocabHelper.insertData(new Vocab(819,"One Way Traffic","traffic sign"));
        vocabHelper.insertData(new Vocab(820,"Pedestrian Crossing","traffic sign"));
        vocabHelper.insertData(new Vocab(821,"Railway Crossing","traffic sign"));
        vocabHelper.insertData(new Vocab(822,"Railway Crossing Without Gate","traffic sign"));
        vocabHelper.insertData(new Vocab(823,"Reduce Speed","traffic sign"));
        vocabHelper.insertData(new Vocab(824,"Right Tune Split","traffic sign"));
        vocabHelper.insertData(new Vocab(825,"Right Winding Road","traffic sign"));
        vocabHelper.insertData(new Vocab(826,"Road Closed Ahead","traffic sign"));
        vocabHelper.insertData(new Vocab(827,"Road narrows on right","traffic sign"));
        vocabHelper.insertData(new Vocab(828,"Road Work Ahead","traffic sign"));

        vocabHelper.insertData(new Vocab(829,"Roundabout Ahead","traffic sign"));
        vocabHelper.insertData(new Vocab(830,"School","traffic sign"));
        vocabHelper.insertData(new Vocab(831,"Shoulder Ahead","traffic sign"));
        vocabHelper.insertData(new Vocab(832,"Side Road","traffic sign"));
        vocabHelper.insertData(new Vocab(833,"Signal Ahead","traffic sign"));
        vocabHelper.insertData(new Vocab(834,"Slippery Road","traffic sign"));
        vocabHelper.insertData(new Vocab(835,"Speed Limited","traffic sign"));
        vocabHelper.insertData(new Vocab(836,"Staggered junction","traffic sign"));
        vocabHelper.insertData(new Vocab(837,"Steep Hill Ascent","traffic sign"));
        vocabHelper.insertData(new Vocab(838,"Steep Hill Descent","traffic sign"));

        vocabHelper.insertData(new Vocab(839,"Stop","traffic sign"));
        vocabHelper.insertData(new Vocab(840,"T- junction","traffic sign"));
        vocabHelper.insertData(new Vocab(841,"Trucks Prohibited","traffic sign"));
        vocabHelper.insertData(new Vocab(842,"Tunnel","traffic sign"));
        vocabHelper.insertData(new Vocab(843,"Turn Left","traffic sign"));
        vocabHelper.insertData(new Vocab(844,"Turn Right","traffic sign"));
        vocabHelper.insertData(new Vocab(845,"Two Way Traffic","traffic sign"));
        vocabHelper.insertData(new Vocab(846,"Uneven Road","traffic sign"));
        vocabHelper.insertData(new Vocab(847,"Washboard road","traffic sign"));
        vocabHelper.insertData(new Vocab(848,"Weight Limitation","traffic sign"));

        vocabHelper.insertData(new Vocab(849,"Width Limitation","traffic sign"));

    }

}
