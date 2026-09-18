
package prog5121_poe_part1;

import java.util.HashMap;
import java.util.Map;

public class LanguageManager {
    private Map<String, String> english = new HashMap<>();
    private Map<String, String> afrikaans = new HashMap<>();
    private Map<String, String> xhosa = new HashMap<>();
    private Map<String, String> zulu = new HashMap<>();
    private Map<String, String> sepedi = new HashMap<>();
    private Map<String, String> setswana = new HashMap<>();
    private Map<String, String> currentLanguage;
    private String currentLanguageName = "English";
    
    public LanguageManager () {
        loadEnglish();
        loadAfrikaans();
        loadXhosa();
        loadZulu();
        loadSepedi();
        loadSetswana();
        currentLanguage = english;
    }
    
    private void loadEnglish() {
        english.put("select_lang", "Select your preferred language");
        english.put("options", "1. English 2. Afrikaans 3. isiXhosa 4.isiZulu 5.Pedi 6.Tshwana");
        english.put("enter_firstname", "Enter your First Name: ");
        english.put("enter_lastname", "Enter your Last Name: ");
        english.put("enter_username", "Enter Username (must contain _ and <=5 chars, e.g. kyl_1): ");
        english.put("enter_password", "Enter Password (8+ chars, capital, number, special): ");
        english.put("enter_cell", "Enter SA Cell Number (e.g. +27634551093): ");
        english.put("username_success", "Username successfully captured.");
        english.put("username_failed", "Username is incorrect; please ensure that your username does not contain more than five characters in length.");
        english.put("password_success", "Password successfully captured.");
        english.put("password_failed", "Password is incorrect; please ensure that your password contains at least eight characters or more in length.");
        english.put("cell_success", "Cell phone number is successfully loaded.");
        english.put("cell_failed", "Cell phone number is incorrectly inserted; please check again and ensure your cell number is a SA cell number.");
        english.put("register_success", "User registration was successfull.");
        english.put("login_promt", "---LOGIN---");
        english.put("login_username", "Username: ");
        english.put("login_password", "Password: ");
        english.put("login_success", "Welcome <firstName>, <lastName> is the greating you will see.");
        english.put("login_failed", "Username or password was incorrect, please try again.");
    }
        
    private void loadAfrikaans() {
        afrikaans.put("select_lang", "Kies jou voorkeur tall");
        afrikaans.put("options", "1. Engels 2. Afrikaans 3. Xhosa 4. Zoeloe 5. Pedi 6. Tswana");
        afrikaans.put("enter_firstname", "Voer jou Voornaam in: ");
        afrikaans.put("enter_lastname", "Voer jou Van in: ");
        afrikaans.put("enter_username", "Voer Gebruikersnaam in (moet _ bevat en <=5): ");
        afrikaans.put("enter_password", "Voer Wagwoord in (8+, hoofletter, nommer, spesiaal): ");
        afrikaans.put("enter_cell", "Voer SA Selfoonnommer in (bv. +27634551093): ");
        afrikaans.put("username_success", "Gebruikersnaam suksesvol vasgele.");
        afrikaans.put("username_failed", "Gebruikersnaam is nie korrek geformateer nie; maak seker dit bevat 'n _ en is nie meer as vyf karakters nie.");
        afrikaans.put("password_success", "Wagwoord suksesvol vasgele.");
        afrikaans.put("password_failed", "Wagwoord is nie korret nie; moet 8 karakters, hoofletter, nommer en spesiale karakter bevat");
        afrikaans.put("cell_success", "Selfoonnommer suksesvol bygevoeg. ");
        afrikaans.put("cell_failed", "Selfoonnommer verkeerd grformateer of bevat nie internasionale kode nie.");
        afrikaans.put("register_success", "Gebruiker suksesvol gergistreer.");
        afrikaans.put("login_prompt", "---AANTEKEN---");
        afrikaans.put("login_username", "Gebruikersnaam: ");
        afrikaans.put("login_password", "Wagwoord:");
        afrikaans.put("login_success", "Welkom <firstName>, <lastName> dit is wonderlik om jou weer te sien.");
        afrikaans.put("login_failed", "Gebruikersnaam of wagwoord verkeerd, probeer weer.");
    }
    
        private void loadXhosa() {
        xhosa.put("select_lang", "Khetha ulwimi lwakho");
        xhosa.put("options", "1. IsiNgesi 2. IsiBulu 3. isiXhosa 4. isiZulu 5. isiPedi 6. Setswana");
        xhosa.put("enter_firstname", "Faka Igama lakho: ");
        xhosa.put("enter_lastname", "Faka Ifani yakho: ");
        xhosa.put("enter_username", "Faka Igama lomsebenzisi (kufuneka libe no_): ");
        xhosa.put("enter_password", "Faka Iphasiwedi (8+, omkhulu, inani, uphawu): ");
        xhosa.put("enter_cell", "Faka Inombolo ye SA (+27634551093): ");
        xhosa.put("username_success", "Igama lomsebenzisi libanjwe ngempumelelo.");
        xhosa.put("username_failed", "Igama alibhalwange kakuhle; liqulethe u _ kwaye <=5.");
        xhosa.put("password_success", "Iphasiwedi ibanjwe ngempumelelo.");
        xhosa.put("password_failed", "Iphasiwedi ayichanekanga; 8 chars, omkhulu, inani, uphawu.");
        xhosa.put("cell_success", "Inombolo yongezwe ngempumelelo.");
        xhosa.put("cell_failed", "Inombolo ayibhalwanga kakuhle okanye ayinayo ikhowudi.");
        xhosa.put("register_success", "Umsebenzisi ubhaliswe ngempumelelo.");
        xhosa.put("login_prompt", "---NGENA---");
        xhosa.put("login_username", "Igama: ");
        xhosa.put("login_password", "Iphasiwedi: ");
        xhosa.put("login_success", "Wamkelekile <firstName>, <lastName> kulungile ukubona.");
        xhosa.put("login_failed", "Igama okanye iphasiwedi ayichanekanga.");
        }
        
        private void loadZulu() {
        zulu.put("select_lang", "Khetha ulimi lawakho");
        zulu.put("options", "1.IsiNgisi 2. IsiBhulu 3. isiXhosa 4. isiZulu 5.isiPedi 6.Setswana");
        zulu.put("enter_firstname", "Faka Igama lakho");
        zulu.put("enter_lastname", "Faka Isibongo: ");
        zulu.put("enter_username", "Faka Igama lomsebnzisi (kumele libe no _): ");
        zulu.put("enter_password", "Faka Iphasiwedi (8+, omkhulu, inombolo, uphawu): ");
        zulu.put("enter_cell", "Faka Inombolo ye SA (+27634551093): ");
        zulu.put("username_success", "Igama lithathwe nqempumelelo.");
        zulu.put("username_failed", "Igama alibhalwanga kahle; liqukethe u _ futhi <=5.");
        zulu.put("password_success", "Iphasiwedi ithathwe ngempumelelo.");
        zulu.put("password_failed", "Iphasiwedi ayilungile; 8 chars, omkulu, inombolo, uphawu.");
        zulu.put("cell_success", "Inombolo yengezwe ngempumelelo.");
        zulu.put("cell_failed", "Inombolo ibhalwe ngendlela engalungile.");
        zulu.put("register_success", "Umsebenzisi ubhaliswe ngempumelelo.");
        zulu.put("login_prompt", "---NGENA---");
        zulu.put("login_username", "Igama: ");
        zulu.put("login_password", "Iphasiwedi: ");
        zulu.put("login_success", "Sawubona <firstName>, <lastName> kuhle ukubona.");
        zulu.put("login_failed", "Igama noma iphasiwedi ayilungile.");
        }
        
        private void loadSepedi() {
        sepedi.put("select_lang", "Kgetha polelo ya gago");
        sepedi.put("options", "1. Seisemane 2. Afrikaans 3. Xhosa 4. Zulu 5. Sepedi 6. Setswana");
        sepedi.put("enter_firstname", "Tsenya Leina: ");
        sepedi.put("enter_lastname", "Tsenya Sefane: ");
        sepedi.put("enter_username", "Tsenya Leina la Modirisi (le na le _): ");
        sepedi.put("enter_password", "Tsenya Phasewete (8+, kogolo, nomoro, leswao): ");
        sepedi.put("enter_cell", "Tsenya Nomoro ya SA (+27634551093): ");
        sepedi.put("username_success", "Leina le tserwe ka katlego.");
        sepedi.put("username_failed", "Leina ga lea beakanya; le na le _gomme <=5.");
        sepedi.put("password_success", "Phasewete e tserwe.");
        sepedi.put("password_failed", "Phasewete ga ya loka; 8, kgolo, nomoro, leswao.");
        sepedi.put("cell_success", "Nomoro e okeditswe.");
        sepedi.put("cell_failed", "Nomoro e beakantswe ka phoso.");
        sepedi.put("register_success", "Modirisi o ngwadisitswe.");
        sepedi.put("login_prompt", "---TSENA---");
        sepedi.put("login_username", "Leina: ");
        sepedi.put("login_password", "Phasewete: ");
        sepedi.put("login_success", "Re a go amogela <firstName>, <lastName> go bose go bona.");
        sepedi.put("login_failed", "Leina goba phasewete ga se la nepagala.");
        }
        
        private void loadSetswana() {
        setswana.put("select_lang", "Tlhopha puo ya gago");
        setswana.put("options", "1. Segoa 2. Afrikaans 3. Xhosa 4. Zulu 5.Pedi 6. Setswana");
        setswana.put("enter_firstname", "Tsenya Leina:");
        setswana.put("enter_lastname", "Tsenya Sefane:");
        setswana.put("enter_username", "Tsenya Leina la Modirisi (le na le _): ");
        setswana.put("enter_password", "Tsenya Phasewete (8+, kgolo, nomoro, letshwao): ");
        setswana.put("enter_cell", "Tsenya Nomoro ya SA (+27634551093): ");
        setswana.put("username_success", "Leina ke tserwe ka katlego");
        setswana.put("username_failed", "Leina ga lea bopagala; lena le _ mme <=5.");
        setswana.put("password_success", "Phasewete e tserwe.");
        setswana.put("password_failed", "Phasewete ga ya siama; 8, kgolo, nomoro, letshwao.");
        setswana.put("cell_success", "Nomoro e tsenngwe.");
        setswana.put("cell_failed", "Nomoro e bopilwe ka phoso");
        setswana.put("register_success", "Modirisi o kwadisitswe.");
        setswana.put("login_prompt", "---TSENA---");
        setswana.put("login_username", "Leina: ");
        setswana.put("login_password", "Phasewete: ");
        setswana.put("login_success", "Re go amogela <firstName>, <lastName> go molemo go bona.");
        setswana.put("login_failed", "Leina kgotsa phasewete ga le a siama.");
        }
        
        public void setLanguage(String choice) {
            if (choice.equals("1")) {
                currentLanguage = english;
                currentLanguageName = "English";
            } else if (choice.equals("2")) {
                currentLanguage = afrikaans;
                currentLanguageName = "Afrikaans";
            } else if (choice.equals("3")) {
                currentLanguage = xhosa;
                currentLanguageName = "Xhosa";
            } else if (choice.equals("4")) {
                currentLanguage = zulu;
                currentLanguageName = "Zulu";
            } else if (choice.equals("5")) {
                currentLanguage = sepedi;
                currentLanguageName = "Sepedi";
            } else if (choice.equals("6")) {
                currentLanguage = setswana;
                currentLanguageName = "Setswana";
            } else {
                currentLanguage = english;
                currentLanguageName = "English";
            }
        }  
   
        public String get(String key) {
            return currentLanguage.getOrDefault(key, key);
        }
        
        public String getCurrent() {
            return currentLanguageName;
        }
        
}
