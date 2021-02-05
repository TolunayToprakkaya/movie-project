package com.project.movie.base.util.cast;

import com.project.movie.entity.CastEntity;
import com.project.movie.entity.CastFeatureEntity;
import com.project.movie.repository.CastFeatureRepository;
import com.project.movie.repository.CastRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

@Component
public class CastDBInitializerUtil {

    private CastRepository castRepository;

    private CastFeatureRepository castFeatureRepository;

    @PostConstruct
    private void initDb() {
        /*
        if (castRepository.count() <= 0) {
            createCastsAndFeatures();
        }
        if (castFeatureRepository.count() <= 0) {
            createCastsAndFeatures();
        }
         */
    }

    private void createCastsAndFeatures() {
        CastFeatureEntity castFeatureEntity1 = new CastFeatureEntity();
        CastFeatureEntity.builder()
                .castId(1L)
                .isActor(0L)
                .isActress(1L)
                .build();

        CastEntity castEntity1 = CastEntity.builder()
                .name("Diane")
                .lastname("Keaton")
                .birthday(new GregorianCalendar(1946, Calendar.FEBRUARY, 5).getTime())
                .birthplace("Los Angeles, California, ABD")
                .biography("Diane Keaton was born Diane Hall in Los Angeles, California, to Dorothy Deanne (Keaton), an amateur photographer, and John Newton Ignatius 'Jack' Hall, a civil engineer and real estate broker. She studied Drama at Santa Ana College, before dropping out in favor of the Neighborhood Playhouse in New York.")
                .castFeatureEntity(castFeatureEntity1)
                .build();

        CastFeatureEntity castFeatureEntity2 = new CastFeatureEntity();
        CastFeatureEntity.builder()
                .castId(2L)
                .isActor(1L)
                .isActress(0L)
                .build();

        CastEntity castEntity2 = CastEntity.builder()
                .name("Al")
                .lastname("Pacino")
                .birthday(new GregorianCalendar(1940, Calendar.MAY, 25).getTime())
                .birthplace("East Harlem, New York, ABD")
                .biography("Alfredo James 'Al' 'Pacino established himself as a film actor during one of cinema's most vibrant decades, the 1970s, and has become an enduring and iconic figure in the world of American movies.")
                .castFeatureEntity(castFeatureEntity2)
                .build();

        CastFeatureEntity castFeatureEntity3 = new CastFeatureEntity();
        CastFeatureEntity.builder()
                .castId(3L)
                .isActor(1L)
                .isActress(0L)
                .build();

        CastEntity castEntity3 = CastEntity.builder()
                .name("Marlon")
                .lastname("Brando")
                .birthday(new GregorianCalendar(1940, Calendar.MAY, 25).getTime())
                .birthplace("Omaha, Nebraska, ABD")
                .biography("Marlon Brando is widely considered the greatest movie actor of all time, rivaled only by the more theatrically oriented Laurence Olivier in terms of esteem. Unlike Olivier, who preferred the stage to the screen, Brando concentrated his talents on movies after bidding the Broadway stage adieu in 1949, a decision for which he was severely criticized when his star began to dim in the 1960s and he was excoriated for squandering his talents. No actor ever exerted such a profound influence on succeeding generations of actors as did Brando.")
                .castFeatureEntity(castFeatureEntity3)
                .build();

        CastFeatureEntity castFeatureEntity4 = new CastFeatureEntity();
        CastFeatureEntity.builder()
                .castId(4L)
                .isActor(1L)
                .isActress(0L)
                .build();

        CastEntity castEntity4 = CastEntity.builder()
                .name("Edward")
                .lastname("Norton")
                .birthday(new GregorianCalendar(1969, Calendar.AUGUST, 18).getTime())
                .birthplace("Boston, Massachusetts, ABD")
                .biography("American actor, filmmaker and activist Edward Harrison Norton was born on August 18, 1969, in Boston, Massachusetts, and was raised in Columbia, Maryland.")
                .castFeatureEntity(castFeatureEntity4)
                .build();

        CastFeatureEntity castFeatureEntity5 = new CastFeatureEntity();
        CastFeatureEntity.builder()
                .castId(5L)
                .isActor(1L)
                .isActress(0L)
                .build();

        CastEntity castEntity5 = CastEntity.builder()
                .name("Brad")
                .lastname("Pitt")
                .birthday(new GregorianCalendar(1963, Calendar.DECEMBER, 18).getTime())
                .birthplace("Shawnee, Oklahoma, ABD")
                .biography("An actor and producer known as much for his versatility as he is for his handsome face, Golden Globe-winner Brad Pitt's most widely recognized role may be Tyler Durden in Dövüş Kulübü (1999). However, his portrayals of Billy Beane in Kazanma Sanatı (2011), and Rusty Ryan in the remake of Ocean's 11 (2001) and its sequels, also loom large in his filmography.")
                .castFeatureEntity(castFeatureEntity5)
                .build();

        CastFeatureEntity castFeatureEntity6 = new CastFeatureEntity();
        CastFeatureEntity.builder()
                .castId(6L)
                .isActor(0L)
                .isActress(1L)
                .build();

        CastEntity castEntity6 = CastEntity.builder()
                .name("Helena Bonham")
                .lastname("Carter")
                .birthday(new GregorianCalendar(1966, Calendar.MAY, 26).getTime())
                .birthplace("Islington, Londra, Birleşik Krallık")
                .biography("Helena Bonham Carter is an actress of great versatility, one of the UK's finest and most successful. Bonham Carter was born May 26, 1966 in Golders Green, London, England, the youngest of three children of Elena (née Propper de Callejón), a psychotherapist, and Raymond Bonham Carter, a merchant banker.")
                .castFeatureEntity(castFeatureEntity6)
                .build();

        CastFeatureEntity castFeatureEntity7 = new CastFeatureEntity();
        CastFeatureEntity.builder()
                .castId(7L)
                .isActor(1L)
                .isActress(0L)
                .build();

        CastEntity castEntity7 = CastEntity.builder()
                .name("Jean")
                .lastname("Reno")
                .birthday(new GregorianCalendar(1948, Calendar.JULY, 30).getTime())
                .birthplace("Kasablanka, Fas")
                .biography("Jean Reno was born Juan Moreno y Herrera-Jiménez in Casablanca, Morocco, to Spanish parents (from Andalucía) who moved to North Africa to seek work. His father was a linotypist. Reno settled in France at 17. He began studying drama and has credits in French television and theater as well as films. His first two marriages both ended in divorce, and he had two children with each of them. He keeps homes in Paris and Los Angeles.")
                .castFeatureEntity(castFeatureEntity7)
                .build();

        CastFeatureEntity castFeatureEntity8 = new CastFeatureEntity();
        CastFeatureEntity.builder()
                .castId(8L)
                .isActor(1L)
                .isActress(0L)
                .build();

        CastEntity castEntity8 = CastEntity.builder()
                .name("Gary")
                .lastname("Oldman")
                .birthday(new GregorianCalendar(1958, Calendar.MARCH, 21).getTime())
                .birthplace("New Cross, Londra, Birleşik Krallık")
                .biography("Gary Oldman is a talented English movie star and character actor, renowned for his expressive acting style.")
                .castFeatureEntity(castFeatureEntity8)
                .build();

        CastFeatureEntity castFeatureEntity9 = new CastFeatureEntity();
        CastFeatureEntity.builder()
                .castId(9L)
                .isActor(0L)
                .isActress(1L)
                .build();

        CastEntity castEntity9 = CastEntity.builder()
                .name("Natalie")
                .lastname("Portman")
                .birthday(new GregorianCalendar(1981, Calendar.JUNE, 9).getTime())
                .birthplace("Kudüs")
                .biography("Natalie was born Natalie Hershlag on June 9, 1981, in Jerusalem, Israel. She is the only child of Avner Hershlag, a Israeli-born doctor, and Shelley Stevens, an American-born artist (from Cincinnati, Ohio), who also acts as Natalie's agent. Her parents are both of Ashkenazi Jewish descent.")
                .castFeatureEntity(castFeatureEntity9)
                .build();

        castFeatureRepository.saveAll(Arrays.asList(castFeatureEntity1, castFeatureEntity2, castFeatureEntity3, castFeatureEntity4, castFeatureEntity5, castFeatureEntity6, castFeatureEntity7, castFeatureEntity8, castFeatureEntity9));
        castRepository.saveAll(Arrays.asList(castEntity1, castEntity2, castEntity3, castEntity4, castEntity5, castEntity6, castEntity7, castEntity8, castEntity9));
    }
}
