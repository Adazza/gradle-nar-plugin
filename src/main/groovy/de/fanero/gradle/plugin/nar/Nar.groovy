package de.fanero.gradle.plugin.nar

import org.gradle.api.tasks.bundling.Jar

/**
 * @author Robert K�hne
 */
class Nar extends Jar {

    Nar() {
        extension = 'nar'
    }
}
