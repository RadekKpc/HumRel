package HumRel.agh;

import java.io.*;

public class Attr_Creator {
    String id_names[] = {
            "Tomasz_Kondratiuk_06746882583055867376",
            "Wiktor_Bogunia_05051826292660540513",
            "Tomasz_Boniek_41987491475262553639",
            "Jan_Bieniek_36910213200908243148",
            "Józef_Kowalski_50546571494520632341",
            "Maciej_Bieniek_37824763556346102597",
            "Laura_Glik_09337709708711287010",
            "Wojciech_Jurecki_07838801966881508156",
            "Lech_Piątek_18650604770599891347",
            "Czesław_Lubański_80920450861397373765",
            "Hubert_Tomczak_99131036160790739192",
            "Lech_Sobczyk_97058751266442176024",
            "Wiktor_Lubański_82766294050338960801",
            "Jerzy_Bogunia_00292293834754560551",
            "Paweł_Kowalski_73177684357699603687",
            "Józef_Kondratiuk_87146769843136529687",
            "Lech_Majewski_50605852359196704088",
            "Maria_Szmal_91589812959681199994",
            "Jan_Glik_49418433232412083510",
            "Józef_Majewski_35782887283400236511",
            "Grzegorz_Bieniek_64053616179216779998",
            "Aleksander_Szmal_97125399062896021529",
            "Jerzy_Milik_38493921429999631476",
            "Urszula_Grabarczyk_80000684544700663711",
            "Kacper_Szmal_50565345762395645357",
            "Aleksandra_Grabarczyk_81274638955844663842",
            "Dawid_Jurecki_11822973133623202881",
            "Jarosław_Nowak_28179883181764130877",
            "Józef_Majewski_35742028442224211530",
            "Lech_Lasek_23993057105813903138",
            "Zuzanna_Jurecki_52961664047496003939",
            "Czesław_Duda_74970556019762794219",
            "Jarosław_Szmal_43474464638309802358",
            "Franciszek_Nowak_05699026084025143182",
            "Jan_Lasek_47117071219054862552",
            "Ignacy_Grabarczyk_01971389481823300935",
            "Robert_Tomczak_15266733891712357069",
            "Jerzy_Zieliński_68699324940438845714",
            "Katarzyna_Pohl_70511169880502562855",
            "Ignacy_Bieniek_46934615751794227358",
            "Łukasz_Kubiak_06070422488831400563",
            "Kamil_Pohl_39523856437612678408",
            "Lech_Kowalski_26666485094561561972",
            "Kacper_Sobczyk_76839632591677340026",
            "Urszula_Duda_81684405954452431783",
            "Tomasz_Lasek_69645138964670437415",
            "Paweł_Syprzak_77347022022023510947",
            "Robert_Syprzak_05618035615881893968",
            "Kamila_Glik_04141215898786920146",
            "Barbara_Szukała_49318049626102895054",
            "Jerzy_Grabarczyk_77051951484577230527",
            "Laura_Jurecki_26708845564101235691",
            "Katarzyna_Jurecki_87669539901435489385",
            "Maria_Majewski_76971017439787377434",
            "Aleksandra_Jakubik_23015741453782037770",
            "Maria_Grabarczyk_68213477965198460644",
            "Wojciech_Nowak_95763128694037006815",
            "Jerzy_Szmal_50489957310416540271",
            "Kacper_Nowak_31779356795667694704",
            "Maria_Kondratiuk_72454894440576083497",
            "Zuzanna_Bieniek_85880769983760143698",
            "Bartosz_Jurecki_74306571088988161285",
            "Bartosz_Kowalski_34452703165662456834",
            "Kamil_Jurecki_31644343107771081513",
            "Zuzanna_Zagumny_26883873663992738472",
            "Piotr_Majewski_86545978746330997497",
            "Józef_Kurek_00984006438127676693",
            "Piotr_Zagumny_95839099021027998070",
            "Kamila_Szczęsny_50996198460662735028",
            "Leopold_Majewski_69033203708731912085",
            "Laura_Zagumny_80854180413847648558",
            "Kamila_Syprzak_16690600734096490452",
            "Franciszek_Pohl_17541171601448936025",
            "Kacper_Majewski_76382119323545663756",
            "Bartosz_Nowak_53332443672576669032",
            "Czesław_Kowalski_87154301352835644039",
            "Kamila_Milik_19229974321822202902",
            "Jan_Kubiak_48941537751114585179",
            "Kamila_Grzegorzek_67315714850054397651",
            "Aleksander_Majewski_60401424443814416148",
            "Zuzanna_Lasek_19476039443385651867",
            "Oswald_Grzegorzek_33468861078793883476",
            "Oswald_Bogunia_37543244670011874491",
            "Hubert_Lewandowski_31518804029627080868",
            "Jerzy_Szukała_55250380772335706782",
            "Maciej_Bielecki_87862777382118322341",
            "Hubert_Jakubik_08269809672666918470",
            "Wojciech_Kurek_95109323321705317886",
            "Czesław_Duda_46800447218229565925",
            "Ignacy_Kubiak_97997723377985000176",
            "Tomasz_Piątek_57768652510278820346",
            "Leopold_Kondratiuk_47422788848847322281",
            "Urszula_Glik_79328456806110794521",
            "Leopold_Nowak_23371718119012717284",
            "Jarosław_Bielecki_01082175001785038591",
            "Czesław_Lewandowski_77824872507171242748",
            "Kamil_Szmal_24667342033115927113",
            "Adam_Nowak_98101463081867245211",
            "Katarzyna_Nowak_80199212532639708099",
            "Hubert_Sobczyk_25763433834564418770",
            "Kacper_Boniek_12901272819177635507",
            "Adam_Jakubik_94584020039906715826",
            "Dominika_Lasek_20786403047960734934",
            "Oswald_Kubiak_91457605783500458012",
            "Laura_Syprzak_35255159097563782193",
            "Józef_Syprzak_78097605496728264251",
            "Robert_Jurecki_18547842187754828468",
            "Maciej_Wójcik_28529326938049431219",
            "Urszula_Zieliński_13573381051636060364",
            "Maciej_Kubiak_20935222250029169578",
            "Jerzy_Zieliński_40299886265935412494",
            "Katarzyna_Piątek_64482060922023650610",
            "Józef_Piątek_19040906955389264921",
            "Hubert_Lubański_60826650875947347421",
            "Jakub_Zieliński_97279220565635540897",
            "Bartosz_Lasek_85002317029846894817",
            "Dawid_Bielecki_31921856236748390947",
            "Barbara_Glik_22249677069895863838",
            "Józef_Wójcik_69257507673946305071",
            "Jerzy_Jurecki_02821322570699647558",
            "Barbara_Lewandowski_15770373649250259213",
            "Zuzanna_Boniek_04492803879029159749",
            "Tomasz_Milik_42801293329439385360",
            "Dawid_Szczęsny_78392494829607102887",
            "Jan_Zagumny_77978379948180674917",
            "Jakub_Jakubik_96766291718872699653",
            "Aleksandra_Kurek_96580267666936711595",
            "Bartosz_Szukała_39162349250702534565",
            "Grzegorz_Boniek_86088454027490386951",
            "Wiktor_Zagumny_51180733705573784524",
            "Leopold_Jakubik_48051217434126627804",
            "Łukasz_Boniek_13587646556227976422",
            "Józef_Bieniek_89379561268216510023",
            "Katarzyna_Sobczyk_67205484526754834204",
            "Tomasz_Piątek_48205727618194874288",
            "Piotr_Lubański_45173301634321239828",
            "Oswald_Kondratiuk_08798134880790518955",
            "Jerzy_Lasek_54946881637052209796",
            "Laura_Grzegorzek_01916775635903458836",
            "Piotr_Lasek_56245933029257589785",
            "Jan_Bogunia_88700508331407241058",
            "Jan_Glik_57167388258979639621",
            "Kamila_Grzegorzek_82390412584383452393",
            "Józef_Boniek_88795839431463204026",
            "Kacper_Wójcik_40976982832963468475",
            "Franciszek_Kowalski_85306227470710740433",
            "Maciej_Majewski_52560476431481697391",
            "Jan_Piątek_43889298568785387728",
            "Robert_Majewski_27555292174777427979",
            "Adam_Lubański_59077805400464411851",
            "Barbara_Lubański_91089043960134934268",
            "Piotr_Zagumny_96931955104872089854",
            "Laura_Nowak_95863073281429718650",
            "Łukasz_Szczęsny_37712114556564329164",
            "Laura_Bogunia_40503542375137392914",
            "Tomasz_Nowak_37167850433947903903",
            "Barbara_Jakubik_30690770142834801324",
            "Kacper_Kowalski_52533564091057050800",
            "Kamil_Grabarczyk_91061844218865182912",
            "Aleksandra_Lewandowski_14513519893528567108",
            "Ignacy_Nowak_72954435131129589214",
            "Paweł_Bogunia_37095080622030889101",
            "Jan_Milik_47673849463855375385",
            "Kamila_Syprzak_71301920393279895364",
            "Kamila_Glik_00516671337916248796",
            "Wiktor_Lewandowski_76865324461967683749",
            "Oswald_Sobczyk_27931183717062396468",
            "Lech_Boniek_64210648408383275564",
            "Kamil_Bieniek_44235927869384769879",
            "Kacper_Pohl_14979913933091705704",
            "Robert_Jakubik_81868066910066343360",
            "Józef_Lasek_81727622945394441534",
            "Jakub_Szmal_90722246261424665383",
            "Bartosz_Kondratiuk_11501830119608232696",
            "Czesław_Kondratiuk_94637649265595896933",
            "Oswald_Jakubik_45300056974122662859",
            "Bartosz_Boniek_37833081939826420409",
            "Dominika_Bogunia_75015264736748187986",
            "Czesław_Wójcik_90033831964253894989",
            "Jerzy_Jurecki_42969149800545973199",
            "Aleksandra_Wójcik_28340607269266760557",
            "Franciszek_Nowak_79418862064922075109",
            "Katarzyna_Boniek_29998930181847029569",
            "Katarzyna_Jakubik_78794422173213791108",
            "Kacper_Milik_07275639239336282803",
            "Dawid_Lewandowski_09653512241380451634",
            "Kamila_Bogunia_46099213531277350884",
            "Łukasz_Szczęsny_88266015136837183096",
            "Lech_Duda_30207032450169909542",
            "Hubert_Boniek_08731033500528068552",
            "Adam_Boniek_31346423868886426340",
            "Urszula_Kowalski_68740098589661438530",
            "Bartosz_Szczęsny_63765869827843636651",
            "Laura_Nowak_79939476840298320135",
            "Wiktor_Lewandowski_79394848763676333770",
            "Kamil_Szczęsny_78031439914524301085",
            "Barbara_Bielecki_85602092458047485344",
            "Barbara_Glik_54409541468466874629",
            "Aleksandra_Sobczyk_37092493401020217879",
            "Jan_Lubański_23738418212682535025",
            "Radosław_Kopeć_688230519820972"
    };
    public String[] attributes = {
            "Jedzenie_polskie",
            "Jedzenie_japońskie",
            "Jedzenie_francuskie",
            "Jedzenie_włoskie",
            "Jedzenie_niemieckie",
            "Jedzenie_hinduskie",
            "Gotowanie",
            "Bieganie",
            "Tenis",
            "Piłka_nożna",
            "Siatkówka",
            "Joga",
            "Czytanie_kryminałów",
            "Jazda_na_rowerze",
            "Sztuka",
            "Imprezy",
            "Koszykówka",
            "Narciarstwo",
            "Podróżowanie_stopem",
            "Gra_na_instrumencie",
            "Śpiewanie",
            "Taniec"
    };
    public void generateAttToCreator() throws IOException {
        File attrToCreatorsOutput = new File("attr_to_creator.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(attrToCreatorsOutput);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
        bufferedWriter.write("CREATE");
        bufferedWriter.newLine();
        boolean tab[][] = new boolean[201][201];
        for(int k=0;k<201;k++){
            for(int l=0;l<201;l++){
                tab[k][l] = false;
            }
        }
        for(int i=0;i<id_names.length;i++){

           tab[i][i]=true;
            int randomNumber = (int)(Math.random() * 4 + 2);
            for(int j=0; j<randomNumber;j++){
                int rand = (int)(Math.random() * 201);
                while(tab[i][rand]){
                    rand = (int)(Math.random() * 201);
                }
                bufferedWriter.write("(" + id_names[i] + ")-[:FRIENDS]->(" + id_names[rand] + "),");
                bufferedWriter.newLine();
                bufferedWriter.write("(" + id_names[rand] + ")-[:FRIENDS]->(" + id_names[i] + "),");
                bufferedWriter.newLine();
                tab[i][rand] = tab[rand][i] = true;
            }
        }
    }
}