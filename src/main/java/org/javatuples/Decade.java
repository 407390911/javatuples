/*
 * =============================================================================
 * 
 *   Copyright (c) 2010, The JAVATUPLES team (http://www.javatuples.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package org.javatuples;

import java.util.Collection;
import java.util.Iterator;

/**
 * <p>
 * A tuple of ten elements.
 * </p> 
 * 
 * @since 1.0
 * 
 * @author Daniel Fern&aacute;ndez
 *
 */
public final class Decade<A,B,C,D,E,F,G,H,I,J> extends Tuple {

    private static final long serialVersionUID = -1607420937567707033L;

    private static final int SIZE = 10;

    private final A val0;
    private final B val1;
    private final C val2;
    private final D val3;
    private final E val4;
    private final F val5;
    private final G val6;
    private final H val7;
    private final I val8;
    private final J val9;
    
    
    public static <A,B,C,D,E,F,G,H,I,J> Decade<A,B,C,D,E,F,G,H,I,J> with(final A value0, final B value1, final C value2, final D value3, final E value4, final F value5, final G value6, final H value7, final I value8, final J value9) {
        return new Decade<A,B,C,D,E,F,G,H,I,J>(value0,value1,value2,value3,value4,value5,value6,value7,value8,value9);
    }

    
    /**
     * <p>
     * Create tuple from array. Array has to have exactly ten elements.
     * </p>
     * 
     * @param <X> the array component type 
     * @param array the array to be converted to a tuple
     * @return the tuple
     */
    public static <X> Decade<X,X,X,X,X,X,X,X,X,X> fromArray(final X[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        if (array.length != 10) {
            throw new IllegalArgumentException("Array must have exactly 10 elements in order to create a Decade. Size is " + array.length);
        }
        return new Decade<X,X,X,X,X,X,X,X,X,X>(
                array[0],array[1],array[2],array[3],array[4],
                array[5],array[6],array[7],array[8],array[9]);
    }

    
    /**
     * <p>
     * Create tuple from collection. Collection has to have exactly ten elements.
     * </p>
     * 
     * @param <X> the collection component type 
     * @param collection the collection to be converted to a tuple
     * @return the tuple
     */
    public static <X> Decade<X,X,X,X,X,X,X,X,X,X> fromCollection(final Collection<X> collection) {
        if (collection == null) {
            throw new IllegalArgumentException("Collection cannot be null");
        }
        if (collection.size() != 10) {
            throw new IllegalArgumentException("Collection must have exactly 10 elements in order to create a Decade. Size is " + collection.size());
        }
        final Iterator<X> iter = collection.iterator();
        return new Decade<X,X,X,X,X,X,X,X,X,X>(
                iter.next(),iter.next(),iter.next(),iter.next(),iter.next(),
                iter.next(),iter.next(),iter.next(),iter.next(),iter.next());
    }

    
    
    
    public Decade(
            final A value0,
            final B value1,
            final C value2,
            final D value3,
            final E value4,
            final F value5,
            final G value6,
            final H value7,
            final I value8,
            final J value9) {
        super(SIZE, value0, value1, value2, value3, value4, value5, value6, value7, value8, value9);
        this.val0 = value0;
        this.val1 = value1;
        this.val2 = value2;
        this.val3 = value3;
        this.val4 = value4;
        this.val5 = value5;
        this.val6 = value6;
        this.val7 = value7;
        this.val8 = value8;
        this.val9 = value9;
    }


    public A getValue0() {
        return this.val0;
    }


    public B getValue1() {
        return this.val1;
    }


    public C getValue2() {
        return this.val2;
    }


    public D getValue3() {
        return this.val3;
    }


    public E getValue4() {
        return this.val4;
    }


    public F getValue5() {
        return this.val5;
    }

    
    public G getValue6() {
        return this.val6;
    }


    public H getValue7() {
        return this.val7;
    }


    public I getValue8() {
        return this.val8;
    }


    public J getValue9() {
        return this.val9;
    }


    @Override
    public int getSize() {
        return SIZE;
    }
    
    
    
    public <X> Decade<X,B,C,D,E,F,G,H,I,J> setAt0(final X value) {
        return new Decade<X,B,C,D,E,F,G,H,I,J>(
                value, this.val1, this.val2, this.val3, this.val4, this.val5, this.val6, this.val7, this.val8, this.val9);
    }
    
    public <X> Decade<A,X,C,D,E,F,G,H,I,J> setAt1(final X value) {
        return new Decade<A,X,C,D,E,F,G,H,I,J>(
                this.val0, value, this.val2, this.val3, this.val4, this.val5, this.val6, this.val7, this.val8, this.val9);
    }
    
    public <X> Decade<A,B,X,D,E,F,G,H,I,J> setAt2(final X value) {
        return new Decade<A,B,X,D,E,F,G,H,I,J>(
                this.val0, this.val1, value, this.val3, this.val4, this.val5, this.val6, this.val7, this.val8, this.val9);
    }
    
    public <X> Decade<A,B,C,X,E,F,G,H,I,J> setAt3(final X value) {
        return new Decade<A,B,C,X,E,F,G,H,I,J>(
                this.val0, this.val1, this.val2, value, this.val4, this.val5, this.val6, this.val7, this.val8, this.val9);
    }
    
    public <X> Decade<A,B,C,D,X,F,G,H,I,J> setAt4(final X value) {
        return new Decade<A,B,C,D,X,F,G,H,I,J>(
                this.val0, this.val1, this.val2, this.val3, value, this.val5, this.val6, this.val7, this.val8, this.val9);
    }
    
    public <X> Decade<A,B,C,D,E,X,G,H,I,J> setAt5(final X value) {
        return new Decade<A,B,C,D,E,X,G,H,I,J>(
                this.val0, this.val1, this.val2, this.val3, this.val4, value, this.val6, this.val7, this.val8, this.val9);
    }
    
    public <X> Decade<A,B,C,D,E,F,X,H,I,J> setAt6(final X value) {
        return new Decade<A,B,C,D,E,F,X,H,I,J>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, value, this.val7, this.val8, this.val9);
    }
    
    public <X> Decade<A,B,C,D,E,F,G,X,I,J> setAt7(final X value) {
        return new Decade<A,B,C,D,E,F,G,X,I,J>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, this.val6, value, this.val8, this.val9);
    }
    
    public <X> Decade<A,B,C,D,E,F,G,H,X,J> setAt8(final X value) {
        return new Decade<A,B,C,D,E,F,G,H,X,J>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, this.val6, this.val7, value, this.val9);
    }
    
    public <X> Decade<A,B,C,D,E,F,G,H,I,X> setAt9(final X value) {
        return new Decade<A,B,C,D,E,F,G,H,I,X>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, this.val6, this.val7, this.val8, value);
    }
    

    

    
    
    
    
    public Ennead<B,C,D,E,F,G,H,I,J> removeFrom0() {
        return new Ennead<B,C,D,E,F,G,H,I,J>(
                this.val1, this.val2, this.val3, this.val4, this.val5, this.val6, this.val7, this.val8, this.val9);
    }
    
    public Ennead<A,C,D,E,F,G,H,I,J> removeFrom1() {
        return new Ennead<A,C,D,E,F,G,H,I,J>(
                this.val0, this.val2, this.val3, this.val4, this.val5, this.val6, this.val7, this.val8, this.val9);
    }
    
    public Ennead<A,B,D,E,F,G,H,I,J> removeFrom2() {
        return new Ennead<A,B,D,E,F,G,H,I,J>(
                this.val0, this.val1, this.val3, this.val4, this.val5, this.val6, this.val7, this.val8, this.val9);
    }
    
    public Ennead<A,B,C,E,F,G,H,I,J> removeFrom3() {
        return new Ennead<A,B,C,E,F,G,H,I,J>(
                this.val0, this.val1, this.val2, this.val4, this.val5, this.val6, this.val7, this.val8, this.val9);
    }
    
    public Ennead<A,B,C,D,F,G,H,I,J> removeFrom4() {
        return new Ennead<A,B,C,D,F,G,H,I,J>(
                this.val0, this.val1, this.val2, this.val3, this.val5, this.val6, this.val7, this.val8, this.val9);
    }
    
    public Ennead<A,B,C,D,E,G,H,I,J> removeFrom5() {
        return new Ennead<A,B,C,D,E,G,H,I,J>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val6, this.val7, this.val8, this.val9);
    }
    
    public Ennead<A,B,C,D,E,F,H,I,J> removeFrom6() {
        return new Ennead<A,B,C,D,E,F,H,I,J>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, this.val7, this.val8, this.val9);
    }
    
    public Ennead<A,B,C,D,E,F,G,I,J> removeFrom7() {
        return new Ennead<A,B,C,D,E,F,G,I,J>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, this.val6, this.val8, this.val9);
    }
    
    public Ennead<A,B,C,D,E,F,G,H,J> removeFrom8() {
        return new Ennead<A,B,C,D,E,F,G,H,J>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, this.val6, this.val7, this.val9);
    }
    
    public Ennead<A,B,C,D,E,F,G,H,I> removeFrom9() {
        return new Ennead<A,B,C,D,E,F,G,H,I>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, this.val6, this.val7, this.val8);
    }
    
    
}
