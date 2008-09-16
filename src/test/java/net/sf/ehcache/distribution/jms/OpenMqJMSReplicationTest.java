package net.sf.ehcache.distribution.jms;

/**
 * Run the tests using Open MQ
 * The create_administered_objects needs to have been run first
 * @author Greg Luck
 */
public class OpenMqJMSReplicationTest extends AbstractJMSReplicationTest {

    protected String getConfigurationFile() {
        return "distribution/jms/ehcache-distributed-jms-openmq.xml";
    }

}