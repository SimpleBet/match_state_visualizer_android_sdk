package io.simplebet.games.visualizer;

import java.util.HashMap;
import java.util.Map;

public class Teams {

    public interface TeamNotFoundHandler {
        String onTeamNotFound(String teamAbbreviation);
    }

    static class Nfl {

        String getTeamIdByAbbreviation(String abbreviation, TeamNotFoundHandler handler) {
            String teamId = null;
            if (abbreviation != null) {
                teamId = Abbrv.map.get(abbreviation.toUpperCase());
            }
            if (teamId == null && handler != null) {
                teamId = handler.onTeamNotFound(abbreviation);
            }
            return teamId;
        }

        static class Abbrv {

            static final public String GB = "647ca14b-e4e1-4e24-a703-fde16e8ea73f";

            static final public String DET = "e355ef7f-1add-4be3-aa15-5d1744a8ffc4";

            static final public String LV = "30e8f31d-213c-41df-a1f8-8255290305a7";

            static final public String WAS = "9f20d618-2741-41cc-9089-00ac1d32ce77";

            static final public String MIA = "f8acbaf4-51fc-409f-97a4-e68ab63f7ee3";

            static final public String NE = "9b3a1a52-c2a9-4cca-a36e-d8f5ede1a07a";

            static final public String HOU = "08a3d65a-e016-45b1-a138-85877d8db958";

            static final public String ARI = "4838404d-c4e8-472c-ae4b-355375ecd529";

            static final public String CLE = "c5698110-8e65-4048-878c-5752788470c5";

            static final public String IND = "f935afa4-35da-40fa-a51f-e1f54696381b";

            static final public String TEN = "c1ff0725-55b9-40bb-8a84-aa337dd129a7";

            static final public String BUF = "34f86ed1-f87f-4bcf-b14f-7faff246d209";

            static final public String NO = "06c79977-27de-45a6-b392-c8830cd3445e";

            static final public String KC = "6bc3a40e-9bab-44ba-a356-b66ee9b6d0ef";

            static final public String PHI = "0759d4f9-7813-490c-a450-57693d0a3ca8";

            static final public String CHI = "cf49542a-9c1a-44f0-bd5a-ca685578dd55";

            static final public String BAL = "d6d86554-f5b8-4322-9ed0-cd7ca42a388c";

            static final public String SEA = "571f1cee-7f8a-4576-aef0-bab963e6f49a";

            static final public String TB = "7f0f7ecd-3555-4bdc-b9f3-3a3d6b248c85";

            static final public String DAL = "12e62407-ff7d-45c3-9bec-e77f4ab4894f";

            static final public String NYJ = "2285fdbf-ce60-4bea-a6cc-e43817c6758c";

            static final public String NYG = "f02d7a98-433a-444a-a086-bfa039654a7a";

            static final public String PIT = "20ba3fbf-5413-4801-a0ea-b9cae1c8e671";

            static final public String ATL = "eac74442-bd2d-42a7-8ce9-3aa40fa93937";

            static final public String JAX = "f5691a92-2b60-4a33-b4ae-6e28189eceb6";

            static final public String CAR = "8a28945c-22df-4f78-8e6a-5097e5ff1bb0";

            static final public String MIN = "3a0c07f6-201b-4923-a75e-76716d469acb";

            static final public String CIN = "bc17433a-bf6a-40b3-a385-59bb7c34e393";

            static final public String LAR = "be027b5f-26c0-47bd-921f-4ebc307fbaa4";

            static final public String SF = "a1c8297c-18a2-4cf6-911b-085fe9344650";

            static final public String DEN = "5b800a67-a4c6-4b13-a697-a8e7b6b1cbfb";

            static final public String LAC = "80a0cc14-7bdb-44c0-b77b-3fe2dd69988c";

            static final private Map<String, String> map = new HashMap<String, String>() {{
                put("GB", GB);
                put("DET", DET);
                put("LV", LV);
                put("WAS", WAS);
                put("MIA", MIA);
                put("NE", NE);
                put("HOU", HOU);
                put("ARI", ARI);
                put("CLE", CLE);
                put("IND", IND);
                put("TEN", TEN);
                put("BUF", BUF);
                put("NO", NO);
                put("KC", KC);
                put("PHI", PHI);
                put("CHI", CHI);
                put("BAL", BAL);
                put("SEA", SEA);
                put("TB", TB);
                put("DAL", DAL);
                put("NYJ", NYJ);
                put("NYG", NYG);
                put("PIT", PIT);
                put("ATL", ATL);
                put("JAX", JAX);
                put("CAR", CAR);
                put("MIN", MIN);
                put("CIN", CIN);
                put("LAR", LAR);
                put("SF", SF);
                put("DEN", DEN);
                put("LAC", LAC);
            }};

        }

        static class Name {
            static final public String GreenBayPackers = "647ca14b-e4e1-4e24-a703-fde16e8ea73f";

            static final public String DetroitLions = "e355ef7f-1add-4be3-aa15-5d1744a8ffc4";

            static final public String LasVegasRaiders = "30e8f31d-213c-41df-a1f8-8255290305a7";

            static final public String WashingtonCommanders = "9f20d618-2741-41cc-9089-00ac1d32ce77";

            static final public String MiamiDolphins = "f8acbaf4-51fc-409f-97a4-e68ab63f7ee3";

            static final public String NewEnglandPatriots = "9b3a1a52-c2a9-4cca-a36e-d8f5ede1a07a";

            static final public String HoustonTexans = "08a3d65a-e016-45b1-a138-85877d8db958";

            static final public String ArizonaCardinals = "4838404d-c4e8-472c-ae4b-355375ecd529";

            static final public String ClevelandBrowns = "c5698110-8e65-4048-878c-5752788470c5";

            static final public String IndianapolisColts = "f935afa4-35da-40fa-a51f-e1f54696381b";

            static final public String TennesseeTitans = "c1ff0725-55b9-40bb-8a84-aa337dd129a7";

            static final public String BuffaloBills = "34f86ed1-f87f-4bcf-b14f-7faff246d209";

            static final public String NewOrleansSaints = "06c79977-27de-45a6-b392-c8830cd3445e";

            static final public String KansasCityChiefs = "6bc3a40e-9bab-44ba-a356-b66ee9b6d0ef";

            static final public String PhiladelphiaEagles = "0759d4f9-7813-490c-a450-57693d0a3ca8";

            static final public String ChicagoBears = "cf49542a-9c1a-44f0-bd5a-ca685578dd55";

            static final public String BaltimoreRavens = "d6d86554-f5b8-4322-9ed0-cd7ca42a388c";

            static final public String SeattleSeahawks = "571f1cee-7f8a-4576-aef0-bab963e6f49a";

            static final public String TampaBayBuccaneers = "7f0f7ecd-3555-4bdc-b9f3-3a3d6b248c85";

            static final public String DallasCowboys = "12e62407-ff7d-45c3-9bec-e77f4ab4894f";

            static final public String NewYorkJets = "2285fdbf-ce60-4bea-a6cc-e43817c6758c";

            static final public String NewYorkGiants = "f02d7a98-433a-444a-a086-bfa039654a7a";

            static final public String PittsburghSteelers = "20ba3fbf-5413-4801-a0ea-b9cae1c8e671";

            static final public String AtlantaFalcons = "eac74442-bd2d-42a7-8ce9-3aa40fa93937";

            static final public String JacksonvilleJaguars = "f5691a92-2b60-4a33-b4ae-6e28189eceb6";

            static final public String CarolinaPanthers = "8a28945c-22df-4f78-8e6a-5097e5ff1bb0";

            static final public String MinnesotaVikings = "3a0c07f6-201b-4923-a75e-76716d469acb";

            static final public String CincinnatiBengals = "bc17433a-bf6a-40b3-a385-59bb7c34e393";

            static final public String LosAngelesRams = "be027b5f-26c0-47bd-921f-4ebc307fbaa4";

            static final public String SanFrancisco49ers = "a1c8297c-18a2-4cf6-911b-085fe9344650";

            static final public String DenverBroncos = "5b800a67-a4c6-4b13-a697-a8e7b6b1cbfb";

            static final public String LosAngelesChargers = "80a0cc14-7bdb-44c0-b77b-3fe2dd69988c";
        }
    }

    static class Cfb {

        String getTeamIdByAbbreviation(String abbreviation, TeamNotFoundHandler handler) {
            String teamId = null;
            if (abbreviation != null) {
                teamId = Cfb.Abbrv.map.get(abbreviation.toUpperCase());
            }
            if (teamId == null && handler != null) {
                teamId = handler.onTeamNotFound(abbreviation);
            }
            return teamId;
        }

        static class Abbrv {
            static final public String INCAR = "b7fbf431-58e5-4983-9019-f791f5f36874";

            static final public String ARZ = "4c84e245-3cc7-43ff-80ac-a4a8a8aece20";

            static final public String CMICH = "adf595a8-881d-40ad-a41a-63640779764a";

            static final public String LAMAR = "f74991e7-9a80-40d1-a0a6-ed4dac5da0bd";

            static final public String SCARST = "771b36c3-99d4-4775-9ebf-ef37ddd0f8ce";

            static final public String ALF = "35e9ae64-bb44-4e53-a436-7c823cd8f33e";

            static final public String AKRON = "2d35851e-1761-40dd-a6ff-afd544674cf5";

            static final public String TENST = "ae147d56-422c-499d-a2cb-57280fd24f20";

            static final public String WYOM = "6afccbc0-34ad-4013-a141-6859cd23a444";

            static final public String GAST = "b648a186-ad91-4eda-b849-51165d6cae91";

            static final public String CARK = "01db8812-88d9-4484-9928-eaaabc5dc3d8";

            static final public String COLG = "48fe4314-4a31-48c6-a490-f37a3c8cbc36";

            static final public String TCU = "3f27946f-db6f-49a6-b17e-a54b5ea14db8";

            static final public String CHAT = "40e4ea97-ab4b-464a-b868-d8f816071bd8";

            static final public String PRNCE = "e301ddf4-d1a9-4a84-90bf-f8f0e6cc9995";

            static final public String BUCK = "8cb2f1ea-c202-49d9-a954-57cda45ee930";

            static final public String RICH = "8a2975d5-b3bc-4cf9-ad41-3f90424d9d87";

            static final public String TX = "71566f8a-199d-4e6c-a068-df043d8962f7";

            static final public String WEBST = "93d1a60e-3856-4560-90e3-04f04098892a";

            static final public String MAINE = "bb9ad506-9607-4eb1-9ce4-45ec6ff6211a";

            static final public String UCLA = "0d49780a-d007-4ec7-8668-5532f549758f";

            static final public String BAYL = "7ef6aae1-2696-404b-8896-b9f0b38c8c0e";

            static final public String GAS = "58dc7f89-bbab-4d3a-bf97-968c4c9690f2";

            static final public String KENEST = "4539900f-6250-48e8-95b2-b7a619bee261";

            static final public String NILL = "85f5e7c5-2c5c-4c74-83f0-0543e8211f30";

            static final public String SMU = "1c39f44f-8c9a-4994-b919-f47579f28bf2";

            static final public String MARY = "f56fd9c2-c66b-4291-a9e9-b09eab94138c";

            static final public String UNLV = "1d11cdbb-ba8f-429f-ac00-f177beb3f6c6";

            static final public String WM = "ff17d2bc-806d-495b-b96c-6620b386383c";

            static final public String WASHST = "1e2cee1e-1f51-4a4b-a02e-cff9c198f4e6";

            static final public String HOWRD = "46deeb6b-ff46-47e6-8dbe-7bf2b47c2732";

            static final public String OREGST = "de2c8349-fd9a-42c4-a1a1-403a76c30199";

            static final public String UTEP = "fb226fb8-176a-4a5a-93c2-648567639398";

            static final public String IOWAST = "731bd357-da58-413b-8e2f-5be228466d0f";

            static final public String ILL = "23512867-9015-4e9e-9a7b-f9312a889b4f";

            static final public String UAB = "9d8030fe-7e42-427d-92fc-a93be5f28f61";

            static final public String SJST = "351f5047-1cf0-4d18-92fa-d2aa169f16d6";

            static final public String FURMAN = "6341bb2b-410c-4bb1-aa7b-b341adb6fc46";

            static final public String OKST = "4fa48107-9627-41c1-a8ae-09de22758ee9";

            static final public String FLINT = "04241187-4ec8-4d4f-8d12-1ca247600902";

            static final public String STFPA = "550e78b0-696d-4827-aeba-75b3f1424c58";

            static final public String IDHST = "8db121c8-46b6-4952-a0c4-242fe6bb4d13";

            static final public String SAVST = "7c38a6da-4ba9-477f-9f2b-79003aa0699a";

            static final public String ARK = "9889dbf2-f181-4035-a445-35a78b86c0e5";

            static final public String NOPA = "a58bbafd-3cba-4f74-8b6c-9074b011ee6a";

            static final public String WOFF = "06d5e018-ff7f-452d-aa59-bdea2ad8e924";

            static final public String SFAUS = "0288ce5d-436c-4f76-b137-7b44facf2be1";

            static final public String IDAHO = "a6e4a6dc-2ae9-453b-bd9f-e1b038c6392b";

            static final public String YNGST = "50ce084d-3f15-4716-b065-0653e6c18f0d";

            static final public String NCOL = "95d2c571-d17f-41bd-9dbe-b933dced2869";

            static final public String ELON = "82ced6ae-9ba5-4dcf-bc4a-f429fc42542d";

            static final public String NEAST = "cf8bdbe2-9e5d-4d02-bd02-6e5472651bc4";

            static final public String FL = "0db5cee5-5b23-4cc8-8d58-57071801e087";

            static final public String MORGST = "49e00b37-4413-49aa-adb9-52fc989645ec";

            static final public String STMN = "620c60ce-5dc9-4f37-b890-5194a2787d16";

            static final public String DXST = "1823f9f6-c6ab-4d5f-bee9-b87b46a4486a";

            static final public String SDKST = "70a5ed05-2db9-4369-802d-16cfd73885ab";

            static final public String LBB = "e72ce609-f655-4637-b072-d41b7379ca63";

            static final public String MIA = "33589e47-8175-47b4-8485-bec58c6395f9";

            static final public String SACST = "4319920c-1321-4753-811c-d5624f0bca4a";

            static final public String UTAH = "cce02815-f0dc-4265-ab53-bb421e74f14f";

            static final public String RUTGER = "cd4968fe-5e97-495f-b734-a32b6b097fcc";

            static final public String NARZ = "6bd8b550-6926-4ed1-8bd6-0c79fcdbf3fb";

            static final public String NTX = "17597908-1d3b-4c57-a274-30273a65f3d9";

            static final public String UTSA = "b37c6827-1967-4ac8-bd22-a4e6d695eb23";

            static final public String VILL = "67f32d16-4726-48f5-b853-0d9b80f82569";

            static final public String MARSH = "26e096d5-0226-40ff-b3b7-041c4319d249";

            static final public String MONT = "8f070adc-43bd-40d2-888a-96c1999f7446";

            static final public String SOUMIS = "dcb0f199-596c-4fb3-9db0-d61d493477a6";

            static final public String BALLST = "a100d586-9278-4609-acb2-6a3d98fccb3e";

            static final public String SAMF = "ddcdafaa-6d37-4a3d-bc17-81d02038489f";

            static final public String TEMPL = "6fcd7ca2-25ec-4abe-a3f9-175aca9bcdfe";

            static final public String MINNST = "972b07ea-d2b2-4b65-93d6-fceed8aeb48b";

            static final public String UTAHST = "bba2158a-c2a7-455e-81dd-6bcb7219fd09";

            static final public String HOU = "d4229b3a-bddb-4b0d-983a-5a87457867f7";

            static final public String TMRT = "9cc82b4a-8492-422a-b97a-84fa488420ff";

            static final public String RI = "3ce6d4e3-fb65-4002-b6d5-d964368aeff1";

            static final public String CIN = "c60c040d-7f6a-4bf5-97c0-fee76b5a04b1";

            static final public String FAIRS = "663ec2a9-bd9a-4a12-b6cf-c07b4709fa14";

            static final public String BOISE = "4b3ab245-bc60-4468-9e98-2ca3e22806fb";

            static final public String CLMSN = "452c142d-ad29-4e84-9a9f-f9270a30f0af";

            static final public String ORE = "31cc0356-8dbc-4af8-97d3-3b7558617ab4";

            static final public String SC = "2823afb4-efe2-4f36-a339-b66209ce67c5";

            static final public String SELOU = "0b834ce4-f91e-40c7-a375-9fc756239414";

            static final public String UMASS = "86f464f8-0023-4eb6-9dce-e96aee1159e3";

            static final public String NAVY = "6ff5b257-9cf4-4e00-a529-45ccfda39fe9";

            static final public String WILM = "8c708106-9dc8-4622-93de-7a692941e603";

            static final public String MSRST = "c86238c3-a08d-43b7-9dc3-126d60c7ad02";

            static final public String MCNST = "becf5a40-0907-4ad2-b953-bae2e4122e75";

            static final public String OHIO = "46cf4cf8-47cd-420c-b0c6-d12a4206c209";

            static final public String MISSR = "f1c986dd-a154-4751-9c33-306137136ce6";

            static final public String HOFST = "0670a465-9003-4530-a736-40f455b731c3";

            static final public String NMXST = "3d814371-35ee-4123-9ced-f8f6fb771a04";

            static final public String TOWS = "ac954e1c-690a-4b43-8e91-102be6e7f78a";

            static final public String EWASH = "7e996d5b-ccf5-4092-86f1-e22ff31e4f20";

            static final public String GRMBST = "5d28260a-ca19-4ce7-a474-22afd6a2cecb";

            static final public String ARPB = "63e2abe9-fec2-4e8b-b4bb-a65ae37e1807";

            static final public String DUQ = "76bbd4b7-65e9-43df-bd30-a9e987cbb6fe";

            static final public String LOULAF = "13f9bb4c-92c6-4c56-ad6d-61717e961f27";

            static final public String WNM = "ab01b3d3-2817-4a59-891f-24e19ee37926";

            static final public String CAMP = "1e04c6c4-120f-497c-8fd3-244fc4bf3041";

            static final public String NEVADA = "85415710-37f5-4f66-b4f8-6880ed7e456a";

            static final public String HAMP = "cc2f92c2-2155-424d-987f-f9e64539b83d";

            static final public String COL = "69c42afa-5273-4c38-ba13-55977c2f5768";

            static final public String SUTAH = "3855a88f-f4f4-4f3c-bdd3-d6346994acae";

            static final public String WCAR = "dae5435f-2474-4667-adcf-805f06e332ed";

            static final public String MISS = "4a546d0c-8e51-4e4d-8ac4-9af779e0acd9";

            static final public String ALA = "520ed8a4-2d1f-45d9-9fb9-6a4f95ef7c45";

            static final public String WAG = "d058480a-c5fb-474e-a4ba-77d8b61557ca";

            static final public String FLST = "5aa6e910-6421-4e24-be09-91ba3ddbcf8b";

            static final public String LIUB = "a591ee44-af25-4c06-a626-3ec741a078e9";

            static final public String GTECH = "b9175983-cad3-4a9d-9806-b032a8515835";

            static final public String EILL = "945120ce-a4ad-4d73-840c-5c968ece169a";

            static final public String HDSM = "4bcf696f-b398-478c-81fa-277795c1ef6c";

            static final public String MIAOH = "b596221c-b18c-4c3c-bb0f-a67f77ee6638";

            static final public String MONM = "d7cf808f-5a8c-4c72-9951-5f8306ca13ee";

            static final public String CATA = "6d9fdfd9-d037-4449-9cee-5d1b5fcb41bb";

            static final public String IOWA = "3e160934-ecd1-4189-93f7-06a3388b1cce";

            static final public String WVIR = "6b2a1505-acf0-4830-b4ef-a87a0b5220ec";

            static final public String UCF = "b002aa28-9dfd-4791-a2cb-eb63bfccab99";

            static final public String ARMY = "af504886-54bb-4c24-8d31-36d615eb01e4";

            static final public String LSU = "8c25caf4-5c56-4daf-b8ce-d6a26a30d855";

            static final public String NAL = "63f557dc-5aa9-4996-8628-268b0dc9e34a";

            static final public String HAWAII = "7afdcc77-8774-4983-aebb-20494f39aafd";

            static final public String TENTCH = "132577e3-a8c0-4f57-84fd-a73851f853a0";

            static final public String EKENT = "913559b9-6098-4081-bbf3-0f6aad17bff2";

            static final public String TENN = "557f2240-a2b7-4b72-82c3-28384e740f7c";

            static final public String ENM = "2cf40917-70d1-4179-881a-50d4c26b0e46";

            static final public String BRYANT = "c5c2080d-c54c-4e94-8dc2-5dc88acda871";

            static final public String NICHLS = "fb47c747-43cd-4d62-9386-f029c132c7d4";

            static final public String WISC = "7b532a2f-f94f-4536-b9b9-e1fa7fdaecf3";

            static final public String KAN = "f87ab807-817d-49e0-9807-48ab38cbe248";

            static final public String TXST = "45403b5a-9a72-498a-8c65-401f81b09948";

            static final public String NCAT = "86ca0c5a-1334-4418-8e24-55db2ebcaad7";

            static final public String DRAKE = "6765f343-0c9b-4923-9cb1-c89cb45bef4a";

            static final public String TULANE = "5e95e8b6-236d-4402-9acb-584586e166a3";

            static final public String HOUBAP = "0eb1ccd2-7d6c-43e5-a773-239a0284bec7";

            static final public String OLD = "6bbcfe45-a0bc-4652-8b50-d26a6024132e";

            static final public String SDAK = "d3478910-c4d1-466d-b8aa-01b0383df9d8";

            static final public String MSVLST = "e66bfa44-ee7b-4e16-b7fd-7069628bc2e5";

            static final public String WKENT = "173ab046-3507-47cc-bd87-30f9eb7e39ec";

            static final public String NDAK = "1f78b802-af63-4905-8b49-abbc5c00f9c2";

            static final public String NWOST = "b6c47328-a084-4a39-b2e9-f32c1f7453d8";

            static final public String WAKE = "547dfba1-f13b-4247-8181-6d7b9c6e6264";

            static final public String CAH = "4576260c-1c3c-4089-bc8d-aec5614fb5db";

            static final public String DELST = "d24f688d-f818-46fe-a219-157a3bac214f";

            static final public String MERC = "5c550a97-1e17-4809-b118-d1ea39140325";

            static final public String TULSA = "86920f1c-c8b5-4a78-800b-9e981df52137";

            static final public String NEBR = "29019553-f4ab-4960-b41c-b9ebf251bae5";

            static final public String PENNST = "fcf07eb9-7924-4566-a64f-31775c3e9982";

            static final public String MTNST = "4b97ca61-1902-4a81-91af-2ecf8d2f4f7a";

            static final public String FORDM = "05d827e9-2c9b-4e4a-b82d-74e0881c3a0d";

            static final public String VAMIL = "96d6f8fd-25fd-4ef8-b11b-733dca05cc42";

            static final public String JACKST = "73c221e8-4a27-45c9-b438-7f92708f9ff1";

            static final public String WMICH = "db6cf55f-1f41-4f2a-a5f1-5a1161d6b22f";

            static final public String APPLST = "65453a92-1c98-4429-9d4c-d9cabf29abeb";

            static final public String ARZST = "766b7290-2922-40ba-be42-b56fe30cc566";

            static final public String SILL = "f3ee3074-878c-4698-9682-3046b4c4eb87";

            static final public String MICH = "584a6e9c-a293-4815-9c8b-57d66f1daee9";

            static final public String NIOWA = "e0250181-ed4d-46d5-b3b7-97335e098f47";

            static final public String PORTST = "5d0e694a-88a9-42a2-8d8e-0ee3c617039d";

            static final public String NW = "7547b303-2bff-412b-a13f-88fcc860743c";

            static final public String LEHI = "fbbd1c4f-2fb2-4a9d-ae3a-e8629918b80b";

            static final public String ND = "f70234c4-c17a-4ded-9aa9-e99fb172ba18";

            static final public String WASH = "6c847160-21d0-4608-aa1c-5106cdd16ce8";

            static final public String ROBMS = "df927b89-667e-4f56-8db7-4097503439f7";

            static final public String NORFST = "915a8799-db0c-4946-b27f-a1477d4b78b0";

            static final public String WILL = "88b9917a-e68b-432c-9a11-ce2013733b2d";

            static final public String NMX = "010b364c-c08a-4287-b8b4-2d9cf1b97084";

            static final public String NMH = "4cd7019a-115a-41c1-b0b3-aee7d7cf65ee";

            static final public String CHDE = "4cb17596-9293-4d63-a1f1-6101e505e64b";

            static final public String BCOOK = "9572dda8-c26a-437f-a015-9f30f40e0383";

            static final public String JAXST = "f9a6db4d-bd7f-4255-b6b8-83f7753fc3d5";

            static final public String SOUTH = "b1083eb9-df8e-412c-ac30-c23e22171f07";

            static final public String OKL = "c3a650dd-20c5-4d85-9fa6-bbdca8ab1777";

            static final public String GARDWB = "536b37e3-38f3-4581-b8b6-b0118a176bbf";

            static final public String VTECH = "4139510b-5c92-4a82-84e7-0d5c5f004739";

            static final public String TOLEDO = "3ef813a7-2ed9-4578-852d-249f7768cde8";

            static final public String FREST = "a699b625-a01d-4fce-a7cc-aeea7d69ac2b";

            static final public String SEMST = "56eec899-28c0-424e-8e1c-00be12fd5e40";

            static final public String AUSP = "d842cdd7-0035-442b-b1cf-d4218f3d3d3c";

            static final public String NCST = "80c7be5c-e094-4474-a0be-e77582ff0ea4";

            static final public String MST = "3e3369c2-ec8d-4af0-93d9-913523888adc";

            static final public String NWST = "8f232c6d-b248-48cc-8085-507785da133a";

            static final public String TXS = "1f86b07b-5d9f-4336-b9bf-532d4ba7dfea";

            static final public String GA = "0eb9788c-5cfd-4a09-93e6-b193742ca9d5";

            static final public String YALE = "f421f4f7-75dd-4547-86be-89ed1ac1601d";

            static final public String SRU = "3ca7f4d2-5b51-4ff4-8391-cf690e2263e8";

            static final public String RICE = "448a8359-adb9-4074-90ff-e4210202e0e3";

            static final public String ECAR = "975e0cfd-9d99-4589-94c1-06fab3fd80fc";

            static final public String SDST = "383c68e5-961a-4e2a-a64b-881a768c406a";

            static final public String ETNST = "11ec14fd-f7ab-440c-b6e4-ce6bf039d1d2";

            static final public String USC = "c655b701-c4c2-4199-b194-230a6b3662d2";

            static final public String LAMON = "cafc1eff-2da8-4381-ab0f-6c3634f38f6d";

            static final public String CHARLT = "938ecc8d-50ae-4006-9995-58131abd368c";

            static final public String DUKE = "9b42504e-6b35-4073-bfc2-e8e4abf8d4bd";

            static final public String OBB = "c5766040-c56b-4971-ba05-76dfc3cd0848";

            static final public String TXAMC = "1749cede-b2a5-4d24-a7fa-56a6ed693cdc";

            static final public String BOSCOL = "a04573e5-b855-48a1-9151-74e09bb599fc";

            static final public String DEL = "0602e244-6a51-41e2-9e8e-e27cdbe6af03";

            static final public String TARL = "bf04af30-d3a4-4540-adda-a18ba0aff386";

            static final public String ARMON = "685dbb14-f018-44be-a6a7-4e81f3c42f20";

            static final public String VAND = "670caa95-f097-47d3-ad56-2f03d6e40648";

            static final public String BYU = "bfd3547d-0142-468b-9702-f3b4458d87a1";

            static final public String ABCHR = "b96bc54e-94b4-4261-a0d9-b406734e8344";

            static final public String LIBRTY = "cee43883-767d-495c-af55-fdaf1b1d27a6";

            static final public String JMAD = "a1354fea-476a-4656-bc5d-ad0900f84fe3";

            static final public String LAFAY = "d6ecc296-c817-4449-b939-a6018c3a2964";

            static final public String SFL = "a5b52e15-e072-4c55-938a-88774ad18d1e";

            static final public String MSPST = "049c4fe2-1b2f-479b-b4d7-fe1d58738ad2";

            static final public String IND = "37169ab1-cfca-4af0-9e4c-9ba85b907e0d";

            static final public String VIR = "21ee47ed-c942-45f1-83e9-db61ebd860df";

            static final public String PITT = "904713eb-58e0-4181-b27d-978f75943e4d";

            static final public String PRESB = "e836f44f-dfb3-4f0d-8c3d-4b2e862fb912";

            static final public String CALPOL = "fd3f5fc1-3470-46b1-9b89-ddcbbc8b3f18";

            static final public String INDST = "a4b27fe0-a7fe-4119-9222-7604f8efcc4e";

            static final public String MURST = "9c5a0f57-8859-4911-88dd-c37c90fc0683";

            static final public String CHSOU = "d02f7a52-80de-4aec-bca9-f482b40a6ec7";

            static final public String TROY = "2dfce1d6-6e43-4670-9865-6e00537c6609";

            static final public String AUBRN = "e0782129-cce3-45de-a8b6-98f4755d7346";

            static final public String ALBNY = "57338b18-3444-49c7-aad7-824c6faab11a";

            static final public String MPHS = "400d0386-ebe6-4c2d-91d3-dbe806b6ad1f";

            static final public String CENCON = "355ae8b0-4084-4c07-8556-67c1ae0ee82b";

            static final public String COAST = "37bfe660-a221-4e22-a4a7-ac3347b89847";

            static final public String ILLST = "b0af1998-434c-4031-8fd5-7f8307443b48";

            static final public String ALAST = "840d5b69-deac-45d2-8118-936f1bc3eabc";

            static final public String SMHO = "10bfbca7-41ab-4152-a344-565013dc4f1e";

            static final public String FLATL = "8fc346fd-50ff-4c32-8b53-b14d709940d2";

            static final public String KENTST = "55f7dd26-f484-40c9-80f5-d19df52f73fb";

            static final public String NDKST = "8ce38f33-5301-4971-a61c-f52ba23b0113";

            static final public String COLST = "81d152a4-5de0-407d-b8d4-f31a55ab2269";

            static final public String OHIOST = "e2db50de-dbc7-47bb-95a3-c03c5b62a252";

            static final public String BOWLGR = "67af7981-bf5b-4a7d-8b13-9fa347993143";

            static final public String LOU = "53899647-d381-479e-9056-8a3f6bd6c18b";

            static final public String AIRF = "e7296bad-704a-487a-bc37-f3692ca1eee7";

            static final public String NCW = "ad9b76c5-5a55-41b3-9915-6b511bbc482e";

            static final public String PVAM = "1954cadf-aca4-445b-876f-b369bcd05a94";

            static final public String SYRA = "34a15264-e110-498d-9ed2-d589e285f96b";

            static final public String EMICH = "8022f86a-00e6-4c39-8f28-7ee7cd5bb179";

            static final public String LOUTCH = "a1d5e24b-8eb8-4c7e-a11d-1e6b868ff849";

            static final public String SALA = "ebfecb6d-057d-4aca-8cf0-d2d46b0675ac";

            static final public String ALAAM = "b480b57c-5c3c-415c-a16a-a6996f252862";

            static final public String HOLY = "2424f7dd-36b0-4fcb-b93a-c944931deab8";

            static final public String UCDV = "09ffd536-4422-4758-bfde-b95dc1c30298";

            static final public String ALCST = "2e69f00b-4181-4628-aa53-f4fef66f7634";

            static final public String TXTECH = "2e6e0af1-c08d-4e4b-9259-cf7553b6e7f5";

            static final public String CITA = "81d09a3d-0d9d-4f0b-ab3d-a5ecb8dc7fa4";

            static final public String MONST = "4178e0a8-2c7a-4222-8d29-198099dfdedb";

            static final public String NHAMP = "adc85903-be43-4b2a-98dd-eef6f6ef8a0e";

            static final public String UK = "9a2ede1b-7ef8-47cf-84ee-70c56ebde929";

            static final public String TXAM = "ffbc1bd0-834e-4da3-8ac8-9951b73fce5a";

            static final public String PUR = "26f77355-8550-4ebc-a9b4-714fc6890f61";

            static final public String FLAM = "641b3761-6b32-4b28-82b7-7637a9e353f4";

            static final public String BUF = "03393f52-5b1b-4fb8-9b4d-460e10d20369";

            static final public String NCC = "a9da97e3-6921-48a3-8e8d-e7bc8be1c830";

            static final public String ARKST = "d174807d-3d98-428a-8b35-32553339605e";

            static final public String KANST = "20d4da84-cbad-423b-8342-f3e060a48ed9";

            static final public String STAN = "9940eef8-3467-40e4-9391-eee1aa67527d";

            static final public String UCONN = "465ae612-c5d8-4131-90f3-784bb90b67b2";

            static final public String NCAR = "d448a7f1-32a6-4e5a-b1d4-864478e785d3";

            static final public String STBR = "d3fd8db5-975b-4d47-8f44-0ca07e798ba0";

            static final private Map<String, String> map = new HashMap<String, String>() {{
                put("INCAR", INCAR);
                put("ARZ", ARZ);
                put("CMICH", CMICH);
                put("LAMAR", LAMAR);
                put("SCARST", SCARST);
                put("ALF", ALF);
                put("AKRON", AKRON);
                put("TENST", TENST);
                put("WYOM", WYOM);
                put("GAST", GAST);
                put("CARK", CARK);
                put("COLG", COLG);
                put("TCU", TCU);
                put("CHAT", CHAT);
                put("PRNCE", PRNCE);
                put("BUCK", BUCK);
                put("RICH", RICH);
                put("TX", TX);
                put("WEBST", WEBST);
                put("MAINE", MAINE);
                put("UCLA", UCLA);
                put("BAYL", BAYL);
                put("GAS", GAS);
                put("KENEST", KENEST);
                put("NILL", NILL);
                put("SMU", SMU);
                put("MARY", MARY);
                put("UNLV", UNLV);
                put("WM", WM);
                put("WASHST", WASHST);
                put("HOWRD", HOWRD);
                put("OREGST", OREGST);
                put("UTEP", UTEP);
                put("IOWAST", IOWAST);
                put("ILL", ILL);
                put("UAB", UAB);
                put("SJST", SJST);
                put("FURMAN", FURMAN);
                put("OKST", OKST);
                put("FLINT", FLINT);
                put("STFPA", STFPA);
                put("IDHST", IDHST);
                put("SAVST", SAVST);
                put("ARK", ARK);
                put("NOPA", NOPA);
                put("WOFF", WOFF);
                put("SFAUS", SFAUS);
                put("IDAHO", IDAHO);
                put("YNGST", YNGST);
                put("NCOL", NCOL);
                put("ELON", ELON);
                put("NEAST", NEAST);
                put("FL", FL);
                put("MORGST", MORGST);
                put("STMN", STMN);
                put("DXST", DXST);
                put("SDKST", SDKST);
                put("LBB", LBB);
                put("MIA", MIA);
                put("SACST", SACST);
                put("UTAH", UTAH);
                put("RUTGER", RUTGER);
                put("NARZ", NARZ);
                put("NTX", NTX);
                put("UTSA", UTSA);
                put("VILL", VILL);
                put("MARSH", MARSH);
                put("MONT", MONT);
                put("SOUMIS", SOUMIS);
                put("BALLST", BALLST);
                put("SAMF", SAMF);
                put("TEMPL", TEMPL);
                put("MINNST", MINNST);
                put("UTAHST", UTAHST);
                put("HOU", HOU);
                put("TMRT", TMRT);
                put("RI", RI);
                put("CIN", CIN);
                put("FAIRS", FAIRS);
                put("BOISE", BOISE);
                put("CLMSN", CLMSN);
                put("ORE", ORE);
                put("SC", SC);
                put("SELOU", SELOU);
                put("UMASS", UMASS);
                put("NAVY", NAVY);
                put("WILM", WILM);
                put("MSRST", MSRST);
                put("MCNST", MCNST);
                put("OHIO", OHIO);
                put("MISSR", MISSR);
                put("HOFST", HOFST);
                put("NMXST", NMXST);
                put("TOWS", TOWS);
                put("EWASH", EWASH);
                put("GRMBST", GRMBST);
                put("ARPB", ARPB);
                put("DUQ", DUQ);
                put("LOULAF", LOULAF);
                put("WNM", WNM);
                put("CAMP", CAMP);
                put("NEVADA", NEVADA);
                put("HAMP", HAMP);
                put("COL", COL);
                put("SUTAH", SUTAH);
                put("WCAR", WCAR);
                put("MISS", MISS);
                put("ALA", ALA);
                put("WAG", WAG);
                put("FLST", FLST);
                put("LIUB", LIUB);
                put("GTECH", GTECH);
                put("EILL", EILL);
                put("HDSM", HDSM);
                put("MIAOH", MIAOH);
                put("MONM", MONM);
                put("CATA", CATA);
                put("IOWA", IOWA);
                put("WVIR", WVIR);
                put("UCF", UCF);
                put("ARMY", ARMY);
                put("LSU", LSU);
                put("NAL", NAL);
                put("HAWAII", HAWAII);
                put("TENTCH", TENTCH);
                put("EKENT", EKENT);
                put("TENN", TENN);
                put("ENM", ENM);
                put("BRYANT", BRYANT);
                put("NICHLS", NICHLS);
                put("WISC", WISC);
                put("KAN", KAN);
                put("TXST", TXST);
                put("NCAT", NCAT);
                put("DRAKE", DRAKE);
                put("TULANE", TULANE);
                put("HOUBAP", HOUBAP);
                put("OLD", OLD);
                put("SDAK", SDAK);
                put("MSVLST", MSVLST);
                put("WKENT", WKENT);
                put("NDAK", NDAK);
                put("NWOST", NWOST);
                put("WAKE", WAKE);
                put("CAH", CAH);
                put("DELST", DELST);
                put("MERC", MERC);
                put("TULSA", TULSA);
                put("NEBR", NEBR);
                put("PENNST", PENNST);
                put("MTNST", MTNST);
                put("FORDM", FORDM);
                put("VAMIL", VAMIL);
                put("JACKST", JACKST);
                put("WMICH", WMICH);
                put("APPLST", APPLST);
                put("ARZST", ARZST);
                put("SILL", SILL);
                put("MICH", MICH);
                put("NIOWA", NIOWA);
                put("PORTST", PORTST);
                put("NW", NW);
                put("LEHI", LEHI);
                put("ND", ND);
                put("WASH", WASH);
                put("ROBMS", ROBMS);
                put("NORFST", NORFST);
                put("WILL", WILL);
                put("NMX", NMX);
                put("NMH", NMH);
                put("CHDE", CHDE);
                put("BCOOK", BCOOK);
                put("JAXST", JAXST);
                put("SOUTH", SOUTH);
                put("OKL", OKL);
                put("GARDWB", GARDWB);
                put("VTECH", VTECH);
                put("TOLEDO", TOLEDO);
                put("FREST", FREST);
                put("SEMST", SEMST);
                put("AUSP", AUSP);
                put("NCST", NCST);
                put("MST", MST);
                put("NWST", NWST);
                put("TXS", TXS);
                put("GA", GA);
                put("YALE", YALE);
                put("SRU", SRU);
                put("RICE", RICE);
                put("ECAR", ECAR);
                put("SDST", SDST);
                put("ETNST", ETNST);
                put("USC", USC);
                put("LAMON", LAMON);
                put("CHARLT", CHARLT);
                put("DUKE", DUKE);
                put("OBB", OBB);
                put("TXAMC", TXAMC);
                put("BOSCOL", BOSCOL);
                put("DEL", DEL);
                put("TARL", TARL);
                put("ARMON", ARMON);
                put("VAND", VAND);
                put("BYU", BYU);
                put("ABCHR", ABCHR);
                put("LIBRTY", LIBRTY);
                put("JMAD", JMAD);
                put("LAFAY", LAFAY);
                put("SFL", SFL);
                put("MSPST", MSPST);
                put("IND", IND);
                put("VIR", VIR);
                put("PITT", PITT);
                put("PRESB", PRESB);
                put("CALPOL", CALPOL);
                put("INDST", INDST);
                put("MURST", MURST);
                put("CHSOU", CHSOU);
                put("TROY", TROY);
                put("AUBRN", AUBRN);
                put("ALBNY", ALBNY);
                put("MPHS", MPHS);
                put("CENCON", CENCON);
                put("COAST", COAST);
                put("ILLST", ILLST);
                put("ALAST", ALAST);
                put("SMHO", SMHO);
                put("FLATL", FLATL);
                put("KENTST", KENTST);
                put("NDKST", NDKST);
                put("COLST", COLST);
                put("OHIOST", OHIOST);
                put("BOWLGR", BOWLGR);
                put("LOU", LOU);
                put("AIRF", AIRF);
                put("NCW", NCW);
                put("PVAM", PVAM);
                put("SYRA", SYRA);
                put("EMICH", EMICH);
                put("LOUTCH", LOUTCH);
                put("SALA", SALA);
                put("ALAAM", ALAAM);
                put("HOLY", HOLY);
                put("UCDV", UCDV);
                put("ALCST", ALCST);
                put("TXTECH", TXTECH);
                put("CITA", CITA);
                put("MONST", MONST);
                put("NHAMP", NHAMP);
                put("UK", UK);
                put("TXAM", TXAM);
                put("PUR", PUR);
                put("FLAM", FLAM);
                put("BUF", BUF);
                put("NCC", NCC);
                put("ARKST", ARKST);
                put("KANST", KANST);
                put("STAN", STAN);
                put("UCONN", UCONN);
                put("NCAR", NCAR);
                put("STBR", STBR);
            }};


        }

        static class Name {
            static final public String IncarnateWordCardinals = "b7fbf431-58e5-4983-9019-f791f5f36874";

            static final public String ArizonaWildcats = "4c84e245-3cc7-43ff-80ac-a4a8a8aece20";

            static final public String CentralMichiganChippewas = "adf595a8-881d-40ad-a41a-63640779764a";

            static final public String LamarCardinals = "f74991e7-9a80-40d1-a0a6-ed4dac5da0bd";

            static final public String SouthCarolinaStateBulldogs = "771b36c3-99d4-4775-9ebf-ef37ddd0f8ce";

            static final public String AlfredStateCollegePioneers = "35e9ae64-bb44-4e53-a436-7c823cd8f33e";

            static final public String AkronZips = "2d35851e-1761-40dd-a6ff-afd544674cf5";

            static final public String TennesseeStateTigers = "ae147d56-422c-499d-a2cb-57280fd24f20";

            static final public String WyomingCowboys = "6afccbc0-34ad-4013-a141-6859cd23a444";

            static final public String GeorgiaStatePanthers = "b648a186-ad91-4eda-b849-51165d6cae91";

            static final public String CentralArkansasBears = "01db8812-88d9-4484-9928-eaaabc5dc3d8";

            static final public String ColgateRaiders = "48fe4314-4a31-48c6-a490-f37a3c8cbc36";

            static final public String TCUHornedFrogs = "3f27946f-db6f-49a6-b17e-a54b5ea14db8";

            static final public String ChattanoogaMocs = "40e4ea97-ab4b-464a-b868-d8f816071bd8";

            static final public String PrincetonTigers = "e301ddf4-d1a9-4a84-90bf-f8f0e6cc9995";

            static final public String BucknellBison = "8cb2f1ea-c202-49d9-a954-57cda45ee930";

            static final public String RichmondSpiders = "8a2975d5-b3bc-4cf9-ad41-3f90424d9d87";

            static final public String TexasLonghorns = "71566f8a-199d-4e6c-a068-df043d8962f7";

            static final public String WeberStateWildcats = "93d1a60e-3856-4560-90e3-04f04098892a";

            static final public String MaineBlackBears = "bb9ad506-9607-4eb1-9ce4-45ec6ff6211a";

            static final public String UCLABruins = "0d49780a-d007-4ec7-8668-5532f549758f";

            static final public String BaylorBears = "7ef6aae1-2696-404b-8896-b9f0b38c8c0e";

            static final public String GeorgiaSouthernEagles = "58dc7f89-bbab-4d3a-bf97-968c4c9690f2";

            static final public String KennesawStateOwls = "4539900f-6250-48e8-95b2-b7a619bee261";

            static final public String NorthernIllinoisHuskies = "85f5e7c5-2c5c-4c74-83f0-0543e8211f30";

            static final public String SMUMustangs = "1c39f44f-8c9a-4994-b919-f47579f28bf2";

            static final public String MarylandTerrapins = "f56fd9c2-c66b-4291-a9e9-b09eab94138c";

            static final public String UNLVRebels = "1d11cdbb-ba8f-429f-ac00-f177beb3f6c6";

            static final public String WilliamMaryTribe = "ff17d2bc-806d-495b-b96c-6620b386383c";

            static final public String WashingtonStateCougars = "1e2cee1e-1f51-4a4b-a02e-cff9c198f4e6";

            static final public String HowardBison = "46deeb6b-ff46-47e6-8dbe-7bf2b47c2732";

            static final public String OregonStateBeavers = "de2c8349-fd9a-42c4-a1a1-403a76c30199";

            static final public String UTEPMiners = "fb226fb8-176a-4a5a-93c2-648567639398";

            static final public String IowaStateCyclones = "731bd357-da58-413b-8e2f-5be228466d0f";

            static final public String IllinoisFightingIllini = "23512867-9015-4e9e-9a7b-f9312a889b4f";

            static final public String UABBlazers = "9d8030fe-7e42-427d-92fc-a93be5f28f61";

            static final public String SanJoseStateSpartans = "351f5047-1cf0-4d18-92fa-d2aa169f16d6";

            static final public String FurmanPaladins = "6341bb2b-410c-4bb1-aa7b-b341adb6fc46";

            static final public String OklahomaStateCowboys = "4fa48107-9627-41c1-a8ae-09de22758ee9";

            static final public String FloridaInternationalPanthers = "04241187-4ec8-4d4f-8d12-1ca247600902";

            static final public String StFrancisPARedFlash = "550e78b0-696d-4827-aeba-75b3f1424c58";

            static final public String IdahoStateBengals = "8db121c8-46b6-4952-a0c4-242fe6bb4d13";

            static final public String SavannahStateTigers = "7c38a6da-4ba9-477f-9f2b-79003aa0699a";

            static final public String ArkansasRazorbacks = "9889dbf2-f181-4035-a445-35a78b86c0e5";

            static final public String NorthParkVikings = "a58bbafd-3cba-4f74-8b6c-9074b011ee6a";

            static final public String WoffordTerriers = "06d5e018-ff7f-452d-aa59-bdea2ad8e924";

            static final public String StephenFAustinLumberjacks = "0288ce5d-436c-4f76-b137-7b44facf2be1";

            static final public String IdahoVandals = "a6e4a6dc-2ae9-453b-bd9f-e1b038c6392b";

            static final public String YoungstownStatePenguins = "50ce084d-3f15-4716-b065-0653e6c18f0d";

            static final public String NorthernColoradoBears = "95d2c571-d17f-41bd-9dbe-b933dced2869";

            static final public String ElonPhoenix = "82ced6ae-9ba5-4dcf-bc4a-f429fc42542d";

            static final public String NortheasternHuskies = "cf8bdbe2-9e5d-4d02-bd02-6e5472651bc4";

            static final public String FloridaGators = "0db5cee5-5b23-4cc8-8d58-57071801e087";

            static final public String MorganStateBears = "49e00b37-4413-49aa-adb9-52fc989645ec";

            static final public String StThomasMNTommies = "620c60ce-5dc9-4f37-b890-5194a2787d16";

            static final public String UtahTechTrailblazers = "1823f9f6-c6ab-4d5f-bee9-b87b46a4486a";

            static final public String SouthDakotaStateJackrabbits = "70a5ed05-2db9-4369-802d-16cfd73885ab";

            static final public String LivingstoneBlueBears = "e72ce609-f655-4637-b072-d41b7379ca63";

            static final public String MiamiHurricanes = "33589e47-8175-47b4-8485-bec58c6395f9";

            static final public String SacramentoStateHornets = "4319920c-1321-4753-811c-d5624f0bca4a";

            static final public String UtahUtes = "cce02815-f0dc-4265-ab53-bb421e74f14f";

            static final public String RutgersScarletKnights = "cd4968fe-5e97-495f-b734-a32b6b097fcc";

            static final public String NorthernArizonaLumberjacks = "6bd8b550-6926-4ed1-8bd6-0c79fcdbf3fb";

            static final public String NorthTexasMeanGreen = "17597908-1d3b-4c57-a274-30273a65f3d9";

            static final public String UTSARoadrunners = "b37c6827-1967-4ac8-bd22-a4e6d695eb23";

            static final public String VillanovaWildcats = "67f32d16-4726-48f5-b853-0d9b80f82569";

            static final public String MarshallThunderingHerd = "26e096d5-0226-40ff-b3b7-041c4319d249";

            static final public String MontanaGrizzlies = "8f070adc-43bd-40d2-888a-96c1999f7446";

            static final public String SouthernMissGoldenEagles = "dcb0f199-596c-4fb3-9db0-d61d493477a6";

            static final public String BallStateCardinals = "a100d586-9278-4609-acb2-6a3d98fccb3e";

            static final public String SamfordBulldogs = "ddcdafaa-6d37-4a3d-bc17-81d02038489f";

            static final public String TempleOwls = "6fcd7ca2-25ec-4abe-a3f9-175aca9bcdfe";

            static final public String MinnesotaGoldenGophers = "972b07ea-d2b2-4b65-93d6-fceed8aeb48b";

            static final public String UtahStateAggies = "bba2158a-c2a7-455e-81dd-6bcb7219fd09";

            static final public String HoustonCougars = "d4229b3a-bddb-4b0d-983a-5a87457867f7";

            static final public String UTMartinSkyhawks = "9cc82b4a-8492-422a-b97a-84fa488420ff";

            static final public String RhodeIslandRams = "3ce6d4e3-fb65-4002-b6d5-d964368aeff1";

            static final public String CincinnatiBearcats = "c60c040d-7f6a-4bf5-97c0-fee76b5a04b1";

            static final public String FairmontStateFalcons = "663ec2a9-bd9a-4a12-b6cf-c07b4709fa14";

            static final public String BoiseStateBroncos = "4b3ab245-bc60-4468-9e98-2ca3e22806fb";

            static final public String ClemsonTigers = "452c142d-ad29-4e84-9a9f-f9270a30f0af";

            static final public String OregonDucks = "31cc0356-8dbc-4af8-97d3-3b7558617ab4";

            static final public String SouthCarolinaGamecocks = "2823afb4-efe2-4f36-a339-b66209ce67c5";

            static final public String SELouisianaLions = "0b834ce4-f91e-40c7-a375-9fc756239414";

            static final public String UMassMinutemen = "86f464f8-0023-4eb6-9dce-e96aee1159e3";

            static final public String NavyMidshipmen = "6ff5b257-9cf4-4e00-a529-45ccfda39fe9";

            static final public String WilmingtonCollegeFightinQuakers = "8c708106-9dc8-4622-93de-7a692941e603";

            static final public String MissouriStateBears = "c86238c3-a08d-43b7-9dc3-126d60c7ad02";

            static final public String McNeeseCowboys = "becf5a40-0907-4ad2-b953-bae2e4122e75";

            static final public String OhioBobcats = "46cf4cf8-47cd-420c-b0c6-d12a4206c209";

            static final public String MissouriTigers = "f1c986dd-a154-4751-9c33-306137136ce6";

            static final public String HofstraPride = "0670a465-9003-4530-a736-40f455b731c3";

            static final public String NewMexicoStateAggies = "3d814371-35ee-4123-9ced-f8f6fb771a04";

            static final public String TowsonTigers = "ac954e1c-690a-4b43-8e91-102be6e7f78a";

            static final public String EasternWashingtonEagles = "7e996d5b-ccf5-4092-86f1-e22ff31e4f20";

            static final public String GramblingTigers = "5d28260a-ca19-4ce7-a474-22afd6a2cecb";

            static final public String ArkansasPineBluffGoldenLions = "63e2abe9-fec2-4e8b-b4bb-a65ae37e1807";

            static final public String DuquesneDukes = "76bbd4b7-65e9-43df-bd30-a9e987cbb6fe";

            static final public String LouisianaRaginCajuns = "13f9bb4c-92c6-4c56-ad6d-61717e961f27";

            static final public String WesternNewMexicoMustangs = "ab01b3d3-2817-4a59-891f-24e19ee37926";

            static final public String CampbellFightingCamels = "1e04c6c4-120f-497c-8fd3-244fc4bf3041";

            static final public String NevadaWolfPack = "85415710-37f5-4f66-b4f8-6880ed7e456a";

            static final public String HamptonPirates = "cc2f92c2-2155-424d-987f-f9e64539b83d";

            static final public String ColoradoBuffaloes = "69c42afa-5273-4c38-ba13-55977c2f5768";

            static final public String SouthernUtahThunderbirds = "3855a88f-f4f4-4f3c-bdd3-d6346994acae";

            static final public String WesternCarolinaCatamounts = "dae5435f-2474-4667-adcf-805f06e332ed";

            static final public String OleMissRebels = "4a546d0c-8e51-4e4d-8ac4-9af779e0acd9";

            static final public String AlabamaCrimsonTide = "520ed8a4-2d1f-45d9-9fb9-6a4f95ef7c45";

            static final public String WagnerSeahawks = "d058480a-c5fb-474e-a4ba-77d8b61557ca";

            static final public String FloridaStateSeminoles = "5aa6e910-6421-4e24-be09-91ba3ddbcf8b";

            static final public String LongIslandUniversitySharks = "a591ee44-af25-4c06-a626-3ec741a078e9";

            static final public String GeorgiaTechYellowJackets = "b9175983-cad3-4a9d-9806-b032a8515835";

            static final public String EasternIllinoisPanthers = "945120ce-a4ad-4d73-840c-5c968ece169a";

            static final public String HardinSimmonsCowboys = "4bcf696f-b398-478c-81fa-277795c1ef6c";

            static final public String MiamiOHRedHawks = "b596221c-b18c-4c3c-bb0f-a67f77ee6638";

            static final public String MonmouthHawks = "d7cf808f-5a8c-4c72-9951-5f8306ca13ee";

            static final public String CatawbaIndians = "6d9fdfd9-d037-4449-9cee-5d1b5fcb41bb";

            static final public String IowaHawkeyes = "3e160934-ecd1-4189-93f7-06a3388b1cce";

            static final public String WestVirginiaMountaineers = "6b2a1505-acf0-4830-b4ef-a87a0b5220ec";

            static final public String UCFKnights = "b002aa28-9dfd-4791-a2cb-eb63bfccab99";

            static final public String ArmyBlackKnights = "af504886-54bb-4c24-8d31-36d615eb01e4";

            static final public String LSUTigers = "8c25caf4-5c56-4daf-b8ce-d6a26a30d855";

            static final public String NorthAlabamaLions = "63f557dc-5aa9-4996-8628-268b0dc9e34a";

            static final public String HawaiiRainbowWarriors = "7afdcc77-8774-4983-aebb-20494f39aafd";

            static final public String TennesseeTechGoldenEagles = "132577e3-a8c0-4f57-84fd-a73851f853a0";

            static final public String EasternKentuckyColonels = "913559b9-6098-4081-bbf3-0f6aad17bff2";

            static final public String TennesseeVolunteers = "557f2240-a2b7-4b72-82c3-28384e740f7c";

            static final public String EasternNewMexicoGreyhounds = "2cf40917-70d1-4179-881a-50d4c26b0e46";

            static final public String BryantBulldogs = "c5c2080d-c54c-4e94-8dc2-5dc88acda871";

            static final public String NichollsColonels = "fb47c747-43cd-4d62-9386-f029c132c7d4";

            static final public String WisconsinBadgers = "7b532a2f-f94f-4536-b9b9-e1fa7fdaecf3";

            static final public String KansasJayhawks = "f87ab807-817d-49e0-9807-48ab38cbe248";

            static final public String TexasStateBobcats = "45403b5a-9a72-498a-8c65-401f81b09948";

            static final public String NorthCarolinaATAggies = "86ca0c5a-1334-4418-8e24-55db2ebcaad7";

            static final public String DrakeBulldogs = "6765f343-0c9b-4923-9cb1-c89cb45bef4a";

            static final public String TulaneGreenWave = "5e95e8b6-236d-4402-9acb-584586e166a3";

            static final public String HoustonBaptistHuskies = "0eb1ccd2-7d6c-43e5-a773-239a0284bec7";

            static final public String OldDominionMonarchs = "6bbcfe45-a0bc-4652-8b50-d26a6024132e";

            static final public String SouthDakotaCoyotes = "d3478910-c4d1-466d-b8aa-01b0383df9d8";

            static final public String MississippiValleyStateDeltaDevils = "e66bfa44-ee7b-4e16-b7fd-7069628bc2e5";

            static final public String WesternKentuckyHilltoppers = "173ab046-3507-47cc-bd87-30f9eb7e39ec";

            static final public String NorthDakotaFightingHawks = "1f78b802-af63-4905-8b49-abbc5c00f9c2";

            static final public String NorthwesternOklahomaStateRangers = "b6c47328-a084-4a39-b2e9-f32c1f7453d8";

            static final public String WakeForestDemonDeacons = "547dfba1-f13b-4247-8181-6d7b9c6e6264";

            static final public String CaliforniaGoldenBears = "4576260c-1c3c-4089-bc8d-aec5614fb5db";

            static final public String DelawareStateHornets = "d24f688d-f818-46fe-a219-157a3bac214f";

            static final public String MercerBears = "5c550a97-1e17-4809-b118-d1ea39140325";

            static final public String TulsaGoldenHurricane = "86920f1c-c8b5-4a78-800b-9e981df52137";

            static final public String NebraskaCornhuskers = "29019553-f4ab-4960-b41c-b9ebf251bae5";

            static final public String PennStateNittanyLions = "fcf07eb9-7924-4566-a64f-31775c3e9982";

            static final public String MiddleTennesseeBlueRaiders = "4b97ca61-1902-4a81-91af-2ecf8d2f4f7a";

            static final public String FordhamRams = "05d827e9-2c9b-4e4a-b82d-74e0881c3a0d";

            static final public String VMIKeydets = "96d6f8fd-25fd-4ef8-b11b-733dca05cc42";

            static final public String JacksonStateTigers = "73c221e8-4a27-45c9-b438-7f92708f9ff1";

            static final public String WesternMichiganBroncos = "db6cf55f-1f41-4f2a-a5f1-5a1161d6b22f";

            static final public String AppalachianStateMountaineers = "65453a92-1c98-4429-9d4c-d9cabf29abeb";

            static final public String ArizonaStateSunDevils = "766b7290-2922-40ba-be42-b56fe30cc566";

            static final public String SouthernIllinoisSalukis = "f3ee3074-878c-4698-9682-3046b4c4eb87";

            static final public String MichiganWolverines = "584a6e9c-a293-4815-9c8b-57d66f1daee9";

            static final public String NorthernIowaPanthers = "e0250181-ed4d-46d5-b3b7-97335e098f47";

            static final public String PortlandStateVikings = "5d0e694a-88a9-42a2-8d8e-0ee3c617039d";

            static final public String NorthwesternWildcats = "7547b303-2bff-412b-a13f-88fcc860743c";

            static final public String LehighMountainHawks = "fbbd1c4f-2fb2-4a9d-ae3a-e8629918b80b";

            static final public String NotreDameFightingIrish = "f70234c4-c17a-4ded-9aa9-e99fb172ba18";

            static final public String WashingtonHuskies = "6c847160-21d0-4608-aa1c-5106cdd16ce8";

            static final public String RobertMorrisColonials = "df927b89-667e-4f56-8db7-4097503439f7";

            static final public String NorfolkStateSpartans = "915a8799-db0c-4946-b27f-a1477d4b78b0";

            static final public String WesternIllinoisLeathernecks = "88b9917a-e68b-432c-9a11-ce2013733b2d";

            static final public String NewMexicoLobos = "010b364c-c08a-4287-b8b4-2d9cf1b97084";

            static final public String NewMexicoHighlandsCowboys = "4cd7019a-115a-41c1-b0b3-aee7d7cf65ee";

            static final public String ChadronStateEagles = "4cb17596-9293-4d63-a1f1-6101e505e64b";

            static final public String BethuneCookmanWildcats = "9572dda8-c26a-437f-a015-9f30f40e0383";

            static final public String JacksonvilleStateGamecocks = "f9a6db4d-bd7f-4255-b6b8-83f7753fc3d5";

            static final public String SouthernJaguars = "b1083eb9-df8e-412c-ac30-c23e22171f07";

            static final public String OklahomaSooners = "c3a650dd-20c5-4d85-9fa6-bbdca8ab1777";

            static final public String GardnerWebbBulldogs = "536b37e3-38f3-4581-b8b6-b0118a176bbf";

            static final public String VirginiaTechHokies = "4139510b-5c92-4a82-84e7-0d5c5f004739";

            static final public String ToledoRockets = "3ef813a7-2ed9-4578-852d-249f7768cde8";

            static final public String FresnoStateBulldogs = "a699b625-a01d-4fce-a7cc-aeea7d69ac2b";

            static final public String SoutheastMissouriStateRedhawks = "56eec899-28c0-424e-8e1c-00be12fd5e40";

            static final public String AustinPeayGovernors = "d842cdd7-0035-442b-b1cf-d4218f3d3d3c";

            static final public String NCStateWolfpack = "80c7be5c-e094-4474-a0be-e77582ff0ea4";

            static final public String MichiganStateSpartans = "3e3369c2-ec8d-4af0-93d9-913523888adc";

            static final public String NorthwesternStateDemons = "8f232c6d-b248-48cc-8085-507785da133a";

            static final public String TexasSouthernTigers = "1f86b07b-5d9f-4336-b9bf-532d4ba7dfea";

            static final public String GeorgiaBulldogs = "0eb9788c-5cfd-4a09-93e6-b193742ca9d5";

            static final public String YaleBulldogs = "f421f4f7-75dd-4547-86be-89ed1ac1601d";

            static final public String SlipperyRockRock = "3ca7f4d2-5b51-4ff4-8391-cf690e2263e8";

            static final public String RiceOwls = "448a8359-adb9-4074-90ff-e4210202e0e3";

            static final public String EastCarolinaPirates = "975e0cfd-9d99-4589-94c1-06fab3fd80fc";

            static final public String SanDiegoStateAztecs = "383c68e5-961a-4e2a-a64b-881a768c406a";

            static final public String EastTennesseeStateBuccaneers = "11ec14fd-f7ab-440c-b6e4-ce6bf039d1d2";

            static final public String USCTrojans = "c655b701-c4c2-4199-b194-230a6b3662d2";

            static final public String ULMonroeWarhawks = "cafc1eff-2da8-4381-ab0f-6c3634f38f6d";

            static final public String Charlotte49ers = "938ecc8d-50ae-4006-9995-58131abd368c";

            static final public String DukeBlueDevils = "9b42504e-6b35-4073-bfc2-e8e4abf8d4bd";

            static final public String OklahomaBaptistBison = "c5766040-c56b-4971-ba05-76dfc3cd0848";

            static final public String TexasAMCommerceLions = "1749cede-b2a5-4d24-a7fa-56a6ed693cdc";

            static final public String BostonCollegeEagles = "a04573e5-b855-48a1-9151-74e09bb599fc";

            static final public String DelawareBlueHens = "0602e244-6a51-41e2-9e8e-e27cdbe6af03";

            static final public String TarletonTexans = "bf04af30-d3a4-4540-adda-a18ba0aff386";

            static final public String ArkansasMonticelloBollWeevils = "685dbb14-f018-44be-a6a7-4e81f3c42f20";

            static final public String VanderbiltCommodores = "670caa95-f097-47d3-ad56-2f03d6e40648";

            static final public String BYUCougars = "bfd3547d-0142-468b-9702-f3b4458d87a1";

            static final public String AbileneChristianWildcats = "b96bc54e-94b4-4261-a0d9-b406734e8344";

            static final public String LibertyFlames = "cee43883-767d-495c-af55-fdaf1b1d27a6";

            static final public String JamesMadisonDukes = "a1354fea-476a-4656-bc5d-ad0900f84fe3";

            static final public String LafayetteLeopards = "d6ecc296-c817-4449-b939-a6018c3a2964";

            static final public String SouthFloridaBulls = "a5b52e15-e072-4c55-938a-88774ad18d1e";

            static final public String MississippiStateBulldogs = "049c4fe2-1b2f-479b-b4d7-fe1d58738ad2";

            static final public String IndianaHoosiers = "37169ab1-cfca-4af0-9e4c-9ba85b907e0d";

            static final public String VirginiaCavaliers = "21ee47ed-c942-45f1-83e9-db61ebd860df";

            static final public String PittsburghPanthers = "904713eb-58e0-4181-b27d-978f75943e4d";

            static final public String PresbyterianCollegeBlueHose = "e836f44f-dfb3-4f0d-8c3d-4b2e862fb912";

            static final public String CalPolyMustangs = "fd3f5fc1-3470-46b1-9b89-ddcbbc8b3f18";

            static final public String IndianaStateSycamores = "a4b27fe0-a7fe-4119-9222-7604f8efcc4e";

            static final public String MurrayStateRacers = "9c5a0f57-8859-4911-88dd-c37c90fc0683";

            static final public String CharlestonSouthernBuccaneers = "d02f7a52-80de-4aec-bca9-f482b40a6ec7";

            static final public String TroyTrojans = "2dfce1d6-6e43-4670-9865-6e00537c6609";

            static final public String AuburnTigers = "e0782129-cce3-45de-a8b6-98f4755d7346";

            static final public String AlbanyGreatDanes = "57338b18-3444-49c7-aad7-824c6faab11a";

            static final public String MemphisTigers = "400d0386-ebe6-4c2d-91d3-dbe806b6ad1f";

            static final public String CentralConnecticutBlueDevils = "355ae8b0-4084-4c07-8556-67c1ae0ee82b";

            static final public String CoastalCarolinaChanticleers = "37bfe660-a221-4e22-a4a7-ac3347b89847";

            static final public String IllinoisStateRedbirds = "b0af1998-434c-4031-8fd5-7f8307443b48";

            static final public String AlabamaStateHornets = "840d5b69-deac-45d2-8118-936f1bc3eabc";

            static final public String SamHoustonBearkats = "10bfbca7-41ab-4152-a344-565013dc4f1e";

            static final public String FloridaAtlanticOwls = "8fc346fd-50ff-4c32-8b53-b14d709940d2";

            static final public String KentStateGoldenFlashes = "55f7dd26-f484-40c9-80f5-d19df52f73fb";

            static final public String NorthDakotaStateBison = "8ce38f33-5301-4971-a61c-f52ba23b0113";

            static final public String ColoradoStateRams = "81d152a4-5de0-407d-b8d4-f31a55ab2269";

            static final public String OhioStateBuckeyes = "e2db50de-dbc7-47bb-95a3-c03c5b62a252";

            static final public String BowlingGreenFalcons = "67af7981-bf5b-4a7d-8b13-9fa347993143";

            static final public String LouisvilleCardinals = "53899647-d381-479e-9056-8a3f6bd6c18b";

            static final public String AirForceFalcons = "e7296bad-704a-487a-bc37-f3692ca1eee7";

            static final public String UNCWSeahawks = "ad9b76c5-5a55-41b3-9915-6b511bbc482e";

            static final public String PrairieViewAMPanthers = "1954cadf-aca4-445b-876f-b369bcd05a94";

            static final public String SyracuseOrange = "34a15264-e110-498d-9ed2-d589e285f96b";

            static final public String EasternMichiganEagles = "8022f86a-00e6-4c39-8f28-7ee7cd5bb179";

            static final public String LouisianaTechBulldogs = "a1d5e24b-8eb8-4c7e-a11d-1e6b868ff849";

            static final public String SouthAlabamaJaguars = "ebfecb6d-057d-4aca-8cf0-d2d46b0675ac";

            static final public String AlabamaAMBulldogs = "b480b57c-5c3c-415c-a16a-a6996f252862";

            static final public String HolyCrossCrusaders = "2424f7dd-36b0-4fcb-b93a-c944931deab8";

            static final public String UCDavisAggies = "09ffd536-4422-4758-bfde-b95dc1c30298";

            static final public String AlcornStateBraves = "2e69f00b-4181-4628-aa53-f4fef66f7634";

            static final public String TexasTechRedRaiders = "2e6e0af1-c08d-4e4b-9259-cf7553b6e7f5";

            static final public String TheCitadelBulldogs = "81d09a3d-0d9d-4f0b-ab3d-a5ecb8dc7fa4";

            static final public String MontanaStateBobcats = "4178e0a8-2c7a-4222-8d29-198099dfdedb";

            static final public String NewHampshireWildcats = "adc85903-be43-4b2a-98dd-eef6f6ef8a0e";

            static final public String KentuckyWildcats = "9a2ede1b-7ef8-47cf-84ee-70c56ebde929";

            static final public String TexasAMAggies = "ffbc1bd0-834e-4da3-8ac8-9951b73fce5a";

            static final public String PurdueBoilermakers = "26f77355-8550-4ebc-a9b4-714fc6890f61";

            static final public String FloridaAMRattlers = "641b3761-6b32-4b28-82b7-7637a9e353f4";

            static final public String BuffaloBulls = "03393f52-5b1b-4fb8-9b4d-460e10d20369";

            static final public String NorthCarolinaCentralEagles = "a9da97e3-6921-48a3-8e8d-e7bc8be1c830";

            static final public String ArkansasStateRedWolves = "d174807d-3d98-428a-8b35-32553339605e";

            static final public String KansasStateWildcats = "20d4da84-cbad-423b-8342-f3e060a48ed9";

            static final public String StanfordCardinal = "9940eef8-3467-40e4-9391-eee1aa67527d";

            static final public String UConnHuskies = "465ae612-c5d8-4131-90f3-784bb90b67b2";

            static final public String NorthCarolinaTarHeels = "d448a7f1-32a6-4e5a-b1d4-864478e785d3";

            static final public String StonyBrookSeawolves = "d3fd8db5-975b-4d47-8f44-0ca07e798ba0";


        }
    }
}

