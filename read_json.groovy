import groovy.json.JsonSlurper

def slurper = new JsonSlurper().parse(new File('jsonFormat.json'))

slurper.each { story, storyValue ->
    storyValue.each { broker, brokerValue ->
        brokerValue.each { commandType , commandTypeValue ->
            commandTypeValue.each { command, commandValue ->
                if (command == 'Msgflows') {
                    println "Alter MsgFlows: ${commandValue}"
                }
                println "Commands: ${commandType}: ${commandValue}"
            }
        }
    }
}