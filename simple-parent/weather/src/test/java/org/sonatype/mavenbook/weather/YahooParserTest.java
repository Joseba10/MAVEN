package org.sonatype.mavenbook.weather;

import java.io.InputStream;

import junit.framework.TestCase;

import org.sonatype.mavenbook.weather.Weather;
import org.sonatype.mavenbook.weather.YahooParser;

public class YahooParserTest extends TestCase {

    public YahooParserTest(String name) {
        super(name);
    }

    public void testParser() throws Exception {
        InputStream nyData = getClass().getClassLoader()
          .getResourceAsStream("zalla-weather.xml");
        Weather weather = new YahooParser().parse( nyData );
        assertEquals( "Zalla", weather.getCity() );
        assertEquals( " Basque Country", weather.getRegion() );
        assertEquals( "Spain", weather.getCountry() );
        assertEquals( "10.555555555555555", weather.getTemp() );
        assertEquals( "Cloudy", weather.getCondition() );
        assertEquals( "50", weather.getChill() );
        assertEquals( "90", weather.getHumidity() );
    }
}