package com.joshbgold.SpanishHangman;

import java.util.Random;

/**
 * Created by JoshG on 4/28/2015.
 */
public class WordList{

    private int index = 0;

    String SpanishVerbs[] = {"abatir", "abrasar", "abreviar", "abrazar", "absolver", "absorber", "aburrir", "abusar", "acelerar", "acentuar", "aceptar", "acercar", "acertar", "aclamar", "aclarar", "acompañar", "aconsejar", "acordar", "acostar", "acostumbrar", "activar", "actualizar", "actuar", "acuchillar", "acudir", "acumular", "acusar", "adaptar", "adelantar", "adelgazar", "adherir", "adicionar", "adivinar", "admirar", "admitir", "adoptar", "adorar", "adular", "advertir", "afeitar", "afianzar", "aficionarse", "afirmar", "afrontar", "agitar", "agotar", "agradar", "agradecer", "agrandar", "agravar", "agregar", "agrupar", "aguardar", "ahorrar", "ajustar", "alabar", "alarmar", "alcanzar", "alegrar", "alentar", "alienar", "alimentar", "almorzar", "alojar", "alquilar", "alumbrar", "alzar", "amanecer", "amar", "amenazar", "ampliar", "amplificar", "analizar", "andar", "animar", "anotar", "anular", "anunciar", "añadir", "apagar", "aparcar", "aparecer", "aplaudir", "aplazar", "aplicar", "apodar", "apoderar", "apostar", "apoyar", "apreciar", "aprender", "aprestar", "apresurar", "apretar", "aprobar", "apropriar", "aprovechar", "apurar", "argüir", "articular", "arrancar", "arrastrar", "arreglar", "arrendar", "arrepentirse", "arriesgar", "arrojar", "arruinar", "ascender", "asear", "asegurar", "asentir", "asignar", "asistir", "asociar", "asolar", "aspirar", "asustar", "atacar", "atar", "atender", "atenerse", "aterrizar", "a", "atravesar", "atreverse", "atribuir", "autorizar", "avanzar", "avergonzar", "averiguar", "avisar", "ayudar", "bailar", "bajar", "bañar", "barrer", "bastar", "batallar", "batir", "bautizar", "beber", "besar", "blasfemar", "borrar", "bostezar", "boxear", "brillar", "brincar", "bromear", "broncear", "bullir", "burlar", "buscar", "caber", "caer", "calcular", "calentar", "calificar", "callar", "calmar", "calzar", "caminar", "cansar", "cantar", "carecer", "cargar", "casar", "castigar", "causar", "cavar", "cazar", "cecear", "ceder", "celebrar", "cenar", "censurar", "ceñir", "cepillar", "cercar", "cerrar", "certificar", "circular", "citar", "civilizar", "clamar", "clarear", "clarificar", "clasificar", "cobrar", "cocer", "cocinar", "coger", "coleccionar", "colegir", "colgar", "colocar", "colonizar", "colorar", "comandar", "combatir", "comentar", "comenzar", "cometer", "comisionar", "comparar", "compartir", "compensar", "competir", "completar", "complicar", "componer", "comprar", "comprender", "comprimir", "comprobar", "comprometer", "comulgar", "comunicar", "concebir", "conceder", "concentrar", "concernir", "concertar", "conciliar", "concluir", "concretar", "condenar", "conducir", "conectar", "conferir", "confesar", "confiar", "confirmar", "confluir", "conformar", "confundir", "conmover", "conocer", "conseguir", "consentir", "conservar", "considerar", "consistir", "consolar", "conspirar", "constar", "constituir", "construir", "consultar", "consumir", "contaminar", "contar", "contemplar", "contener", "contentar", "contestar", "continuar", "con", "contraponer", "contrastar", "contratar", "contravenir", "contribuir", "controlar", "convalecer", "convencer", "convenir", "conversar", "convertir", "convocar", "cooperar", "copiar", "cortar", "corregir", "correr", "corresponder", "corromper", "cosquillear", "costar", "crear", "crecer", "creer", "criar", "criticar", "cruzar", "cubrir", "cuestionar", "cuidar", "culpar", "cumplir", "curar", "chafar", "charlar", "chispear", "chistar", "chocar", "chupar", "danzar", "dar", "deber", "debutar", "decantar", "decidir", "decir", "declamar", "declarar", "decorar", "dedicar", "deducir", "defender", "deferir", "definir", "deformar", "defraudar", "dejar", "delegar", "delinquir", "demandar", "demostrar", "denegar", "denotar", "denunciar", "departir", "depender", "deplorar", "deponer", "deportar", "depositar", "depreciar", "deprimir", "derramar", "derribar", "derrotar", "desanimar", "desaparecer", "desaprender", "desaprobar", "desarrollar", "desatar", "desayunar", "descalzar", "descaminar", "descansar", "descender", "descolgar", "desconocer", "describir", "descubrir", "desear", "desenvolver", "deshacer", "designar", "deslizar", "desmentir", "desobedecer", "desordenar", "desorganizar", "despedir", "despegar", "despenalizar", "despertar", "destrozar", "destruir", "desunir", "desvestir", "desviar", "detener", "determinar", "devenir", "devolver", "dibujar", "dictar", "digerir", "dirigir", "discernir", "disculpar", "discutir", "diseminar", "disentir", "disfrazar", "disfrutar", "disimular", "disminuir", "disolver", "dispensar", "disponer", "distinguir", "dis", "distribuir", "divertir", "dividir", "divorciar", "divulgar", "doblar", "doler", "dormir", "ducharse", "dudar", "economizar", "echar", "edificar", "editar", "educar", "efectuar", "ejecutar", "ejercer", "elaborar", "elegir", "embarazar", "embarcar", "embeber", "empezar", "emplear", "enamorarse", "encabezar", "encantar", "encender", "encerrar", "encoger", "encomendar", "encontrar", "endulzar", "enfadar", "enfermar", "enfriar", "engolfarse", "ennegrecer", "enojar", "enrollar", "ensayar", "enseñar", "ensuciar", "entender", "enterrar", "entrar", "entregar", "entretener", "enunciar", "enviar", "envidiar", "envolver", "equipar", "equivocar", "erigir", "errar", "escapar", "escoger", "esconder", "escribir", "escrutar", "escuchar", "esculpir", "escurrir", "esforzar", "esparcir", "especificar", "esperar", "espiar", "esquiar", "establecer", "estar", "estimar", "estorbar", "estornudar", "estrechar", "estropear", "estrujar", "estudiar", "evacuar", "evitar", "evocar", "exagerar", "examinar", "exceptuar", "excitar", "exclamar", "excluir", "excusar", "exhalar", "exigir", "existir", "expedir", "explicar", "explorar", "exponer", "expresar", "exprimir", "extender", "extinguir", "extrañar", "fabricar", "facilitar", "falsificar", "faltar", "fallar", "familiarizar", "fatigar", "favorecer", "felicitar", "festejar", "fiar", "fichar", "fijarse", "finalizar", "fingir", "firmar", "flirtear", "florecer", "flotar", "fluir", "formar", "formular", "fornicar", "forzar", "fotocopiar", "fotografiar", "fregar", "frenar", "frotar", "fumar", "funcionar", "fundar", "fusionar", "ganar", "garantizar", "gastar", "gemir", "generalizar", "generar", "germinar", "gestear", "gestionar", "girar", "gobernar", "golpear", "gotear", "gozar", "graduar", "gratificar", "gravar", "gritar", "gruñir", "guardar", "guiar", "gustarle", "haber", "habitar", "habituar", "hacer", "hallar", "hartar", "heder", "helar", "henchir", "heredar", "herir", "hervir", "hidratar", "hinchar", "hipar", "holgar", "honrar", "hospedar", "hospitalizar", "huir", "identificar", "ignorar", "igualar", "iluminar", "ilusionar", "ilustrar", "imaginar", "imitar", "impedir", "implicar", "imponer", "importarle", "impresionar", "incendiar", "incitar", "inclinar", "incluir", "indicar", "inducir", "inferir", "influenciar", "influir", "informar", "inhalar", "inhibir", "iniciar", "inocular", "inscribir", "insinuar", "insistir", "inspeccionar", "inspirar", "instituir", "instruir", "interesar", "interpretar", "intervenir", "interrumpir", "introducir", "inventar", "invertir", "investigar", "invitar", "invocar", "ir", "irritar", "jabonar", "jactarse", "jugar", "juntar", "jurar", "justificar", "juzgar", "lactar", "lagrimar", "lamentar", "lanzar", "lastimar", "lavar", "leer", "legalizar", "legitimar", "levantar", "liar", "liberar", "licitar", "ligar", "limar", "limitar", "limpiar", "lograr", "lubricar", "luchar", "lustrar", "llamar", "llegar", "llenar", "llevar", "llorar", "llover", "mal", "maltratar", "manchar", "mandar", "manejar", "manifestar", "manipular", "mantener", "maquillarse", "marcar", "marchar", "marginar", "marrar", "mascar", "masticar", "matar", "mecer", "mediar", "medir", "meditar", "mejorar", "memorizar", "mencionar", "menguar", "mentir", "merecer", "meter", "mezclar", "mirar", "mitigar", "modernizar", "modificar", "mojar", "moler", "montar", "morder", "morir", "mostrar", "mover", "mudar", "multiplicar", "nacer", "nadar", "narrar", "naturalizar", "navegar", "necesitar", "negar", "negociar", "nevar", "ningunear", "nombrar", "nominar", "normalizar", "notar", "notificar", "numerar", "nutrir", "obedecer", "objetar", "objetivar", "obliterar", "obrar", "obsequiar", "observar", "obstruir", "obtener", "ocultar", "ocupar", "ocurrir", "oficiar", "ofrecer", "ofrendar", "ofuscar", "oír", "ojear", "olear", "oler", "olfatear", "olvidar", "omitir", "ondularse", "operar", "opinar", "oponer", "oprimir", "optar", "ordenar", "organizar", "osar", "oscilar", "oscurecer", "pagar", "paginar", "palpar", "palpitar", "parar", "parecer", "parir", "participar", "partir", "pasar", "pasear", "patear", "patinar", "pausar", "pedir", "pegar", "peinar", "pelar", "peligrar", "penar", "penetrar", "pensar", "percibir", "perder", "perdonar", "perdurar", "perecer", "perfilar", "perfumar", "perjudicar", "permanecer", "permitir", "permutar", "perseguir", "persistir", "personalizar", "personificar", "persuadir", "pertenecer", "pervertir", "pesar", "pescar", "picar", "pilotar", "pintar", "pisar", "plagar", "planchar", "planear", "plantar", "plantear", "platicar", "poder", "poner", "portarse", "posar", "poseer", "posponer", "potenciar", "practicar", "precisar", "predecir", "predicar", "predisponer", "predominar", "preferir", "preguntar", "prender", "preocupar", "preponer", "prescribir", "presentar", "presentir", "preservar", "prestar", "presuponer", "pretender", "prevalecer", "prevenir", "prever", "principiar", "privar", "probar", "proceder", "proclamar", "procurar", "producir", "proferir", "progresar", "prohibir", "prometer", "promover", "promulgar", "pronunciar", "propagar", "proponer", "proporcionar", "proscribir", "proseguir", "prosperar", "proteger", "protestar", "provenir", "provocar", "publicar", "pulir", "pulsar", "puntuar", "purgar", "quebrantar", "quebrar", "quedar", "quejarse", "quemar", "querer", "quitar", "racionar", "rajar", "rascar", "rasgar", "rastrear", "rastrillar", "ratificar", "razonar", "reaccionar", "realizar", "reanimar", "reanudar", "reaparacer", "rearmar", "reasumir", "rebajar", "rebasar", "rebatir", "rebotar", "recalentar", "recapitular", "recargar", "recelar", "recetar", "recibir", "recitar", "reclamar", "recobrar", "recoger", "recomendar", "recomenzar", "recomponer", "reconcentrar", "reconocer", "reconstituir", "reconstruir", "recontar", "reconvenir", "recordar", "recortar", "recorrer", "rectificar", "recubrir", "recular", "recuperar", "rechazar", "reducir", "referir", "reflejar", "reformar", "regalar", "regar", "regir", "registrar", "regresar", "regular", "rehacer", "reír", "relajar", "relatar", "releer", "relevar", "relumbrar", "rellenar", "remarcar", "remediar", "remeter", "remitir", "remontar", "remorder", "remover", "renacer", "rendir", "renovar", "renunciar", "reñir", "reorganizar", "reparar", "repartir", "repasar", "repeler", "repentizar", "repetir", "repintar", "replantar", "replicar", "reponer", "reposar", "repreguntar", "representar", "reprimir", "reprochar", "reproducir", "repudiar", "repulsar", "requebrar", "requerir", "resaltar", "resbalar", "resentirse", "reservar", "residir", "resistir", "resonar", "respectar", "respetar", "respirar", "responder", "restar", "restituir", "resucitar", "resultar", "resumir", "resurgir", "retar", "retardar", "retener", "retirar", "retorcer", "retractar", "re", "retransmitir", "retrasar", "retratar", "reunir", "revelar", "revender", "reventar", "revertir", "revisar", "re", "revocar", "revoltear", "revolver", "rezar", "rezumar", "ridiculizar", "rimar", "rizar", "rodar", "rodear", "rogar", "romper", "roncar", "rozar", "rumiar", "saber", "saborear", "sacar", "saciar", "sacudir", "salar", "salir", "salivar", "salpicar", "saltar", "saltear", "salvar", "sanar", "sangrar", "santiguar", "satirizar", "satisfacer", "saturar", "sazonar", "secar", "secretar", "secuestrar", "seducir", "segar", "seguir", "sembrar", "sensibilizar", "sentar", "sentir", "señalar", "separar", "ser", "servir", "serrar", "signar", "significar", "silenciar", "simbolizar", "simpatizar", "simplificar", "simular", "sobar", "sobornar", "sobrar", "sobrecoger", "sobreponer", "sobre", "socializar", "socorrer", "sofocar", "solicitar", "solidificar", "soltar", "solventar", "sollozar", "sombrear", "someter", "sonar", "sonreír", "soñar", "soplar", "soportar", "sorber", "sorprender", "sospechar", "sostener", "subestimar", "subir", "sublimar", "subrayar", "subsanar", "subsidiar", "subsistir", "subvenir", "subvertir", "subyugar", "succionar", "suceder", "sudar", "sufrir", "sugerir", "sugestionar", "sujetar", "sumar", "sumergir", "sumir", "superar", "superponer", "supervisar", "suplantar", "suplicar", "suponer", "suprimir", "surgir", "suscribir", "suspender", "suspirar", "sustituir", "sus", "susurrar", "tachar", "tapar", "tapiar", "tardar", "tejar", "telefonear", "temblar", "temer", "tender", "tener", "tentar", "teñir", "teorizar", "terminar", "testar", "testificar", "timar", "timbrar", "tipificar", "tirar", "titular", "tocar", "tolerar", "tomar", "torcer", "toser", "tostar", "trabajar", "traducir", "traficar", "tragar", "tranquilizar", "transcribir", "transferir", "transformar", "transmitir", "transparentar", "transpirar", "transponer", "transportar", "tratar", "trazar", "trenzar", "triunfar", "tropezar", "trotar", "tumbar", "tutear", "ufanarse", "ultimar", "ultrajar", "unificar", "uniformar", "unir", "untar", "usar", "usurpar", "utilizar", "vacar", "vaciar", "vacilar", "vacunar", "vagabundear", "vagar", "valer", "validar", "valorar", "valorizar", "vaporizar", "variar", "vaticinar", "vedar", "vegetar", "velar", "vencer", "vender", "vengar", "venir", "ventilar", "ver", "verificar", "versar", "versificar", "versionar", "verter", "vestir", "viajar", "vibrar", "viciar", "vigilar", "vindicar", "violar", "virar", "visitar", "vislumbrar", "visualizars", "vocalizar", "vociferar", "volar", "voltear", "volver", "votar", "vulgarizar", "yuxtaponer", "zanganear", "zapatear", "zapear", "zumbar", "zurcir"};

    String EnglishDefs[] = {"abate", "scorch", "short",  "embrace", "absolve", "absorb","bored", "abuse", "speed", "accentuate", "accept", "bring", "right", "cheer", "clarify", "accompany", "advise", "agree", "bed", "get used", "activate", "update "," act "," stab "," go "," build "," accuse "," adapt "," forward "," thin "," adhere "," add "," guess "," admire “, “admit", "adopt", "worship", "fawn", "warning", "shaving", "secure", "fond", "affirm", "face", "shake", "exhaust", "please "," thank "," enlarge "," aggravated "," add "," bundle "," await "," save "," set "," praise "," alarm "," achieve "," cheer “, “encourage", "alienate", "feed", "lunch", "stay", "rent", "light", "boost", "dawn", "love", "threatening", "expand", "amplify "," analyze "," walk "," animate "," score "," ring "," announce "," add "," turn off "," park "," appear "," applaud "," postpone “, “apply", "dub", "empower", "bet", "support", "appreciate", "learn", "sizing", "rush", "squeeze", "approve", "apropriar", "tap "," rush "," argue "," articulate "," boot "," drag "," fix "," lease "," repent "," risk "," throwing "," ruin "," ascend “, “clean", "secure", "assent", "map", "attend", "associate", "ravage", "aim", "scare", "attack", "bind", "address", "stick "," landing "," a "," cross "," daring "," attribute "," authorize "," advance "," shame "," find "," warning "," help "," dance “, “Down", "bathe", "sweep", "sufficient", "battle", "beat", "baptize", "drink", "kiss", "blasphemy", "delete", "yawn", "boxing "," shine "," jump "," tease "," brown "," boil "," cheat "," seek "," fit "," fall "," estimate "," warm "," branding “, “silence", "calm", "fit", "walk", "tired", "sing", "lacking", "charge", "married", "punish", "cause", "dig", "hunt “, “ lisp "," give "," celebrate "," dinner "," censor "," belt "," brush "," fence "," close "," certify "," circular "," cite “, “civilize", "cry", "lighten", "clarify", "classified", "cash", "cook", "cooking", "catch", "collecting", "inferred", "hang", "place “, “ colonize "," coloring "," command "," fight "," comment "," start "," commit "," commission "," compare "," share "," make "," compete “, “complete", "complicated", "compose", "buy", "understand", "compress", "check", "commit", "communicate", "communication", "envisage", "award", "concentrate "," concern "," schedule "," fall "," conclude "," concrete "," condemn "," drive "," connect "," confer "," confess "," trust "," confirm “, “converge", "shape", "confused", "move", "learn", "achieve", "consent", "conserve", "consider", "consist", "comfort", "conspiracy", "record "," form "," build "," see "," consume "," contaminate "," expect "," contemplate "," contain "," please "," answer "," continue "," with “, “contrasting", "contrast", "recruit", "infringing", "help", "control", "convalescence", "convincing", "agree", "talk", "convert", "call", "cooperate "," copy "," cut "," correct "," run "," match "," corrupt "," tickle "," cost "," create "," grow "," believe "," breed “, “criticizing", "crossing", "cover", "challenge", "caring", "blame", "meet", "cure", "muss", "chat", "sparkling", "grumbling", "crash "," suck "," dance "," giving "," should "," Start "," decant "," decide "," tell "," recite "," state "," decorate "," spend “, “inferred", "defend", "defer", "set", "warp", "down,”, “stop,”, “delegate", "crime", "sue", "demonstrate", "deny", "denote "," expose "," socialize "," depend "," deplore "," lay "," deportation "," bank "," depreciate "," depress "," pour "," down "," defeat “, “discourage", "disappear", "unlearn", "disapprove", "develop", "loose", "breakfast", "shoes off", "mislead", "rest", "down", "hook", "disown "," describe "," discover "," will "," develop "," break "," appoint "," slide "," deny "," disobey "," disorder "," disorganized "," fire “, “off", "decriminalize", "awakening", "destroy", "destroy", "disengage", "undress", "forward", "stop", "determined", "become", "back", "drawing “, “ dictate "," digest "," steer "," discern "," apologize "," discuss "," spread "," disagree "," disguise "," enjoy "," disguise "," decrease “, “dissolve", "dispense", "have", "distinguished", "dis", "deliver", "fun", "split", "divorce", "release", "bend", "ache", "sleep "," shower "," doubt "," save "," cast "," building "," edit "," educate "," make "," execute "," exercise "," develop "," choose “, “pregnant", "board", "soak", "start", "employed", "in love", "head", "love", "light", "lock", "shrink", "commit", "find “, “ sweeten "," angry "," sick "," cool "," sail out to sea "," black "," angry "," roll "," test "," teach "," dirty "," understand “, “bury", "enter", "deliver", "entertain", "articulate", "send", "envy", "wrap", "furnishing", "wrong", "building", "wander", "escape "," choice "," hide "," write "," scrutinize "," listen "," sculpt "," drain "," strive "," spread "," specify "," expect "," spy “, “skiing", "set", "be", "estimate", "clog", "sneeze", "shake", "ruin", "squeeze", "study", "evacuation", "avoid", "evoke “, “ exaggerate "," examine "," exempt "," exciting "," cry "," exclude "," excuse "," breathe "," require "," there "," issue "," explain “, “explore", "expose", "express", "squeeze", "extend", "extinguish", "wonder", "build", "facilitate", "fake", "miss", "fail", "familiarizing "," fatigue "," favor "," compliment "," celebrate "," trust "," sign "," set "," end "," believe "," sign "," flirt "," bloom “, “float", "flow", "become", "develop", "fornication", "force", "photocopy", "photograph", "scrub", "stop", "rub", "smoking", "work "," found "," fuse "," win "," guarantee "," spend "," whine "," generalize "," build "," sprout "," gestear, “, “ manage, “, “ rotate “, “govern", "beat", "drip", "enjoy", "graduate", "reward", "tax", "scream", "growl", "save", "guide", "liking", "having "," dwelling "," habituate "," make "," find "," satiate "," stink "," ice "," replenish "," inherit "," hurt "," boil "," moisturize “, “swell", "hiccup", "idle", "honor", "host", "hospitalise", "flight", "identify", "ignore", "match", "light", "excite", "illustrate "," imagine "," imitation "," prevent "," imply "," imposing "," caring "," Impress "," burn "," inciting "," tip "," include "," indicate “, “induce", "inferred”, “influence,”, “influence", "inform", "breathing", "inhibit", "start", "inoculate", "register", "hint", "stress", "inspect "," inspiring "," institute "," train "," interest "," play "," step "," stop "," enter "," invent "," invest "," seek "," invite “, “call", "go", "irritated", "soaping", "boast", "play", "together", "swear", "justify", "judge", "feeding", "lagrimar", "regret "," throw "," hurt "," wash "," read "," legalize "," legitimize "," raise "," liar "," free "," tender "," flirt "," file “, “limit", "clean", "achieve", "grease", "fight", "shine", "call", "get", "fill", "carry", "mourn", "rain", "bad "," abuse "," stain "," send "," drive "," express "," handle "," hold "," makeup "," check "," walk "," marginalize "," marrar “, “chew", "chewing", "kill", "rock", "broker", "measure", "think", "improve", "learn", "name", "decrease", "lie", "merit "," meter "," mix "," look "," mitigate "," modernization "," change "," wet "," grind "," mount "," bite "," die "," show “, “move", "change", "multiply", "born", "swim", "tell", "naturalize", "surf", "need", "deny", "bargain", "snow", "ningunear "," name "," appoint "," normalize "," notice "," notification "," number "," feed "," obey "," object "," objectifying "," obliterate "," act “, “give away", "watch", "block", "get", "hide", "occupy", "occur", "officiate", "deliver", "offer up", "obfuscate", "hear", "browse “, “ flutter "," smell "," sniff "," forgotten "," ignore "," curl "," work "," review "," oppose "," press "," choose "," arrange “, “arrange", "daring", "swing", "dark", "pay", "page", "feel", "beat", "stop", "appear", "birth", "benefit", "from "," pass "," walk "," kick "," skating "," pause "," ask "," paste "," comb "," strip "," endangered "," punish "," penetrate “, “think", "sense", "lose", "forgiveness", "last", "perish", "outline", "perfume", "harm", "stay", "allow", "exchange", "chase “, “ persist "," customize "," personify "," persuade "," belonging "," pervert "," weigh "," fish "," chop "," drive "," paint "," step “, “plague", "board", "plan", "plant", "raise", "chat", "power", "set", "acting", "pose", "possess", "delay", "strengthen "," practice "," clarify "," predict "," walk "," predispose "," dominate "," preferred "," ask "," turn "," worry "," preponer "," prescribe “, “present", "foresee", "preserve", "pay", "assume", "intend", "prevail", "prevent", "anticipate", "principiar", "deprive", "test", "proceed “, “ proclaim "," seek "," produce "," uttering "," progress "," ban "," promise "," promote "," enact "," deliver "," spread "," propose “, “provide", "ban", "continue", "prosper", "protect", "protest", "come", "result", "publish", "polish", "press", "rate", "purge "," break "," fail "," become "," complaint "," burn "," will "," remove "," ration "," crack "," scratch "," tear "," crawl “, “rake", "ratify", "reason", "reacted", "make", "revive", "resume", "reaparacer", "reset", "resume", "down", "crossing", "counter "," bounce "," reheating "," unite "," reload "," suspect "," prescribe "," receive "," recite "," claim "," regain "," collect "," recommend “, “restart", "rebuild", "refocus", "recognize", "reconstituted", "building", "recount,”, “reprimand", "remember", "cut", "walk", "correct", "coating “, “ recoil "," back "," reject "," reduce "," refer "," mirror "," reform "," gift "," water "," govern "," register "," back “, “regular", "redo", "laugh", "relax", "tell", "reread", "relieve", "glare", "fill", "highlight", "remedy", "tuck", "forward "," trace "," prick "," remove "," rebirth "," pay "," renewal "," resign "," fight "," reorganize "," repair "," deliver "," brush “, “repel", "repentizar", "repeat", "repaint", "replant”, “replicate", "replace", "sit", "cross-examine", "represent", "suppress", "blame", "Play "," divorce "," Spinning "," requebrar "," require "," highlight "," slide "," suffer "," book "," lie "," weather "," ring "," to respect “, “respect", "breathe", "answer", "subtract", "restore", "rise", "become", "sum", "resurgence", "challenging", "slow", "hold", "withdraw "," twisted "," retract "," re "," broadcast "," slow "," portraying "," collect "," reveal "," resell "," burst "," reverse "," check “, “re", "reverse", "revoltear", "revolver", "pray", "ooze", "ridicule", "rhyme", "curl", "roll", "circle", "pray", "break “, “ snore "," brush "," chew "," knowledge "," taste "," draw "," quench "," shake "," salt "," exit "," salivating "," splashing “, “jump", "saute", "save", "healing", "bleed", "santiguar", "satirize", "suit", "saturated", "seasoning", "dry", "secrete", "hijack "," seduce "," mow "," continue "," seed "," awareness "," sit "," feel "," note "," separate "," being "," serve "," sawing “, “sign", "mean", "silence", "symbolize", "sympathetic", "streamline", "simulate", "grope", "bribe", "overrun", "overwhelm", "overlay", "on “, “ socialize "," help "," stifle "," seek "," solidify "," drop "," solve "," weeping "," shade "," subject "," sound "," smile “, “dreaming", "blow", "support", "suck", "surprise", "suspect", "holding", "underestimate", "up", "sublime", "underline", "cure", "subsidize "," stand "," subvenir "," subverting "," subdue "," suck "," succeed "," sweat "," suffer "," suggest "," suggestible "," hold "," add “, “dip", "plunge", "beat", "overlay", "monitor", "replace", "beg", "assume", "delete", "arise", "sign", "suspend", "sighed "," replace "," their "," whisper "," delete "," cover "," walling "," take "," tiling "," telephone "," shake "," fear "," tender “, “have", "tempting", "stain", "theorized", "end", "test", "witness", "cheat", "ringing", "typing", "throw", "headline", "touch “, “ tolerate "," take "," twist "," cough "," toast "," work "," translate "," traffic "," swallow "," calm "," transcribing "," transfer “, “transform", "transmit", "transparent", "sweat", "transpose", "transport", "treat", "trace", "braid", "success", "trip", "trot", "knock down “, “ tutear "," boast "," complete "," outrage "," unite "," uniform "," unite "," spread "," use "," usurp "," use "," vacate “, “empty", "hesitation", "vaccination", "wander", "wander", "worth", "validate", "evaluate", "value", "spray", "change", "predict", "vedar "," vegetate "," watch "," beat "," sell "," revenge "," come "," vent "," view "," check "," relate "," versification "," versioning “, “pour", "dress", "travel", "vibrate", "vitiate”, “monitor,”, “vindication", "rape", "tack", "visit", "glimpse", "visualizars", "vocalize "," shout "," fly "," turn "," back "," vote "," popularizing "," juxtapose "," zanganear "," stomp "," zap "," buzz "," darning "} ;

    //return a random word from the list
    public String getWord() {
        int i = new Random().nextInt(SpanishVerbs.length);
        index = i;
    //    savePrefs("index", index);
        return SpanishVerbs[i];
    }

    public String getEnglishDefs(int i) {
        return EnglishDefs[i];
    }

/*    //save prefs
    public void savePrefs(String key, int value){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences ();
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(key, value);
        editor.commit();
    }*/



}
