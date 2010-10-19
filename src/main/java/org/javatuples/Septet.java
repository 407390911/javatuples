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

public final class Septet<A,B,C,D,E,F,G> extends Tuple {

    private static final long serialVersionUID = -2133846648934305169L;

    private static final int SIZE = 7;

    private final A val0;
    private final B val1;
    private final C val2;
    private final D val3;
    private final E val4;
    private final F val5;
    private final G val6;
    
    
    
    public static <A,B,C,D,E,F,G> Septet<A,B,C,D,E,F,G> with(final A value0, final B value1, final C value2, final D value3, final E value4, final F value5, final G value6) {
        return new Septet<A,B,C,D,E,F,G>(value0,value1,value2,value3,value4,value5,value6);
    }
    
    
    public Septet(
            final A value0,
            final B value1,
            final C value2,
            final D value3,
            final E value4,
            final F value5,
            final G value6) {
        super(SIZE, value0, value1, value2, value3, value4, value5, value6);
        this.val0 = value0;
        this.val1 = value1;
        this.val2 = value2;
        this.val3 = value3;
        this.val4 = value4;
        this.val5 = value5;
        this.val6 = value6;
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


    @Override
    public int getSize() {
        return SIZE;
    }
    
    
    

    
    
    
    public <X0> Octet<X0,A,B,C,D,E,F,G> addAtPos0(final X0 value0) {
        return new Octet<X0,A,B,C,D,E,F,G>(
                value0, this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, 
                this.val6);
    }
    
    public <X0> Octet<A,X0,B,C,D,E,F,G> addAtPos1(final X0 value0) {
        return new Octet<A,X0,B,C,D,E,F,G>(
                this.val0, value0, this.val1, this.val2, this.val3, this.val4, this.val5, 
                this.val6);
    }
    
    public <X0> Octet<A,B,X0,C,D,E,F,G> addAtPos2(final X0 value0) {
        return new Octet<A,B,X0,C,D,E,F,G>(
                this.val0, this.val1, value0, this.val2, this.val3, this.val4, this.val5, 
                this.val6);
    }
    
    public <X0> Octet<A,B,C,X0,D,E,F,G> addAtPos3(final X0 value0) {
        return new Octet<A,B,C,X0,D,E,F,G>(
                this.val0, this.val1, this.val2, value0, this.val3, this.val4, this.val5, 
                this.val6);
    }
    
    public <X0> Octet<A,B,C,D,X0,E,F,G> addAtPos4(final X0 value0) {
        return new Octet<A,B,C,D,X0,E,F,G>(
                this.val0, this.val1, this.val2, this.val3, value0, this.val4, this.val5, 
                this.val6);
    }
    
    public <X0> Octet<A,B,C,D,E,X0,F,G> addAtPos5(final X0 value0) {
        return new Octet<A,B,C,D,E,X0,F,G>(
                this.val0, this.val1, this.val2, this.val3, this.val4, value0, this.val5, 
                this.val6);
    }
    
    public <X0> Octet<A,B,C,D,E,F,X0,G> addAtPos6(final X0 value0) {
        return new Octet<A,B,C,D,E,F,X0,G>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, value0, 
                this.val6);
    }
    
    public <X0> Octet<A,B,C,D,E,F,G,X0> addAtPos7(final X0 value0) {
        return new Octet<A,B,C,D,E,F,G,X0>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, this.val6, 
                value0);
    }

    
    
    
    
    public <X0,X1> Ennead<X0,X1,A,B,C,D,E,F,G> addAtPos0(final X0 value0, final X1 value1) {
        return new Ennead<X0,X1,A,B,C,D,E,F,G>(
                value0, value1, this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, 
                this.val6);
    }
    
    public <X0,X1> Ennead<A,X0,X1,B,C,D,E,F,G> addAtPos1(final X0 value0, final X1 value1) {
        return new Ennead<A,X0,X1,B,C,D,E,F,G>(
                this.val0, value0, value1, this.val1, this.val2, this.val3, this.val4, this.val5, 
                this.val6);
    }
    
    public <X0,X1> Ennead<A,B,X0,X1,C,D,E,F,G> addAtPos2(final X0 value0, final X1 value1) {
        return new Ennead<A,B,X0,X1,C,D,E,F,G>(
                this.val0, this.val1, value0, value1, this.val2, this.val3, this.val4, this.val5, 
                this.val6);
    }
    
    public <X0,X1> Ennead<A,B,C,X0,X1,D,E,F,G> addAtPos3(final X0 value0, final X1 value1) {
        return new Ennead<A,B,C,X0,X1,D,E,F,G>(
                this.val0, this.val1, this.val2, value0, value1, this.val3, this.val4, this.val5, 
                this.val6);
    }
    
    public <X0,X1> Ennead<A,B,C,D,X0,X1,E,F,G> addAtPos4(final X0 value0, final X1 value1) {
        return new Ennead<A,B,C,D,X0,X1,E,F,G>(
                this.val0, this.val1, this.val2, this.val3, value0, value1, this.val4, this.val5, 
                this.val6);
    }
    
    public <X0,X1> Ennead<A,B,C,D,E,X0,X1,F,G> addAtPos5(final X0 value0, final X1 value1) {
        return new Ennead<A,B,C,D,E,X0,X1,F,G>(
                this.val0, this.val1, this.val2, this.val3, this.val4, value0, value1, this.val5, 
                this.val6);
    }
    
    public <X0,X1> Ennead<A,B,C,D,E,F,X0,X1,G> addAtPos6(final X0 value0, final X1 value1) {
        return new Ennead<A,B,C,D,E,F,X0,X1,G>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, value0, value1, 
                this.val6);
    }
    
    public <X0,X1> Ennead<A,B,C,D,E,F,G,X0,X1> addAtPos7(final X0 value0, final X1 value1) {
        return new Ennead<A,B,C,D,E,F,G,X0,X1>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, this.val6, 
                value0, value1);
    }
    


    
    
    
    
    public <X0,X1,X2> Decade<X0,X1,X2,A,B,C,D,E,F,G> addAtPos0(final X0 value0, final X1 value1, final X2 value2) {
        return new Decade<X0,X1,X2,A,B,C,D,E,F,G>(
                value0, value1, value2, this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, 
                this.val6);
    }
    
    public <X0,X1,X2> Decade<A,X0,X1,X2,B,C,D,E,F,G> addAtPos1(final X0 value0, final X1 value1, final X2 value2) {
        return new Decade<A,X0,X1,X2,B,C,D,E,F,G>(
                this.val0, value0, value1, value2, this.val1, this.val2, this.val3, this.val4, this.val5, 
                this.val6);
    }
    
    public <X0,X1,X2> Decade<A,B,X0,X1,X2,C,D,E,F,G> addAtPos2(final X0 value0, final X1 value1, final X2 value2) {
        return new Decade<A,B,X0,X1,X2,C,D,E,F,G>(
                this.val0, this.val1, value0, value1, value2, this.val2, this.val3, this.val4, this.val5, 
                this.val6);
    }
    
    public <X0,X1,X2> Decade<A,B,C,X0,X1,X2,D,E,F,G> addAtPos3(final X0 value0, final X1 value1, final X2 value2) {
        return new Decade<A,B,C,X0,X1,X2,D,E,F,G>(
                this.val0, this.val1, this.val2, value0, value1, value2, this.val3, this.val4, this.val5, 
                this.val6);
    }
    
    public <X0,X1,X2> Decade<A,B,C,D,X0,X1,X2,E,F,G> addAtPos4(final X0 value0, final X1 value1, final X2 value2) {
        return new Decade<A,B,C,D,X0,X1,X2,E,F,G>(
                this.val0, this.val1, this.val2, this.val3, value0, value1, value2, this.val4, this.val5, 
                this.val6);
    }
    
    public <X0,X1,X2> Decade<A,B,C,D,E,X0,X1,X2,F,G> addAtPos5(final X0 value0, final X1 value1, final X2 value2) {
        return new Decade<A,B,C,D,E,X0,X1,X2,F,G>(
                this.val0, this.val1, this.val2, this.val3, this.val4, value0, value1, value2, this.val5, 
                this.val6);
    }
    
    public <X0,X1,X2> Decade<A,B,C,D,E,F,X0,X1,X2,G> addAtPos6(final X0 value0, final X1 value1, final X2 value2) {
        return new Decade<A,B,C,D,E,F,X0,X1,X2,G>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, value0, value1, 
                value2, this.val6);
    }
    
    public <X0,X1,X2> Decade<A,B,C,D,E,F,G,X0,X1,X2> addAtPos7(final X0 value0, final X1 value1, final X2 value2) {
        return new Decade<A,B,C,D,E,F,G,X0,X1,X2>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, this.val6, 
                value0, value1, value2);
    }
    
    
    
    
    public <X0> Octet<X0,A,B,C,D,E,F,G> addAtPos0(final Unit<X0> tuple) {
        return addAtPos0(tuple.getValue0());
    }
    
    public <X0> Octet<A,X0,B,C,D,E,F,G> addAtPos1(final Unit<X0> tuple) {
        return addAtPos1(tuple.getValue0());
    }
    
    public <X0> Octet<A,B,X0,C,D,E,F,G> addAtPos2(final Unit<X0> tuple) {
        return addAtPos2(tuple.getValue0());
    }
    
    public <X0> Octet<A,B,C,X0,D,E,F,G> addAtPos3(final Unit<X0> tuple) {
        return addAtPos3(tuple.getValue0());
    }
    
    public <X0> Octet<A,B,C,D,X0,E,F,G> addAtPos4(final Unit<X0> tuple) {
        return addAtPos4(tuple.getValue0());
    }
    
    public <X0> Octet<A,B,C,D,E,X0,F,G> addAtPos5(final Unit<X0> tuple) {
        return addAtPos5(tuple.getValue0());
    }
    
    public <X0> Octet<A,B,C,D,E,F,X0,G> addAtPos6(final Unit<X0> tuple) {
        return addAtPos6(tuple.getValue0());
    }
    
    public <X0> Octet<A,B,C,D,E,F,G,X0> addAtPos7(final Unit<X0> tuple) {
        return addAtPos7(tuple.getValue0());
    }
    


    
    
    
    
    public <X0,X1> Ennead<X0,X1,A,B,C,D,E,F,G> addAtPos0(final Pair<X0,X1> tuple) {
        return addAtPos0(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Ennead<A,X0,X1,B,C,D,E,F,G> addAtPos1(final Pair<X0,X1> tuple) {
        return addAtPos1(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Ennead<A,B,X0,X1,C,D,E,F,G> addAtPos2(final Pair<X0,X1> tuple) {
        return addAtPos2(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Ennead<A,B,C,X0,X1,D,E,F,G> addAtPos3(final Pair<X0,X1> tuple) {
        return addAtPos3(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Ennead<A,B,C,D,X0,X1,E,F,G> addAtPos4(final Pair<X0,X1> tuple) {
        return addAtPos4(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Ennead<A,B,C,D,E,X0,X1,F,G> addAtPos5(final Pair<X0,X1> tuple) {
        return addAtPos5(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Ennead<A,B,C,D,E,F,X0,X1,G> addAtPos6(final Pair<X0,X1> tuple) {
        return addAtPos6(tuple.getValue0(),tuple.getValue1());
    }
    
    public <X0,X1> Ennead<A,B,C,D,E,F,G,X0,X1> addAtPos7(final Pair<X0,X1> tuple) {
        return addAtPos7(tuple.getValue0(),tuple.getValue1());
    }

    
    

    
    
    
    
    public <X0,X1,X2> Decade<X0,X1,X2,A,B,C,D,E,F,G> addAtPos0(final Triplet<X0,X1,X2> tuple) {
        return addAtPos0(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    public <X0,X1,X2> Decade<A,X0,X1,X2,B,C,D,E,F,G> addAtPos1(final Triplet<X0,X1,X2> tuple) {
        return addAtPos1(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    public <X0,X1,X2> Decade<A,B,X0,X1,X2,C,D,E,F,G> addAtPos2(final Triplet<X0,X1,X2> tuple) {
        return addAtPos2(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    public <X0,X1,X2> Decade<A,B,C,X0,X1,X2,D,E,F,G> addAtPos3(final Triplet<X0,X1,X2> tuple) {
        return addAtPos3(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    public <X0,X1,X2> Decade<A,B,C,D,X0,X1,X2,E,F,G> addAtPos4(final Triplet<X0,X1,X2> tuple) {
        return addAtPos4(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    public <X0,X1,X2> Decade<A,B,C,D,E,X0,X1,X2,F,G> addAtPos5(final Triplet<X0,X1,X2> tuple) {
        return addAtPos5(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    public <X0,X1,X2> Decade<A,B,C,D,E,F,X0,X1,X2,G> addAtPos6(final Triplet<X0,X1,X2> tuple) {
        return addAtPos6(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    public <X0,X1,X2> Decade<A,B,C,D,E,F,G,X0,X1,X2> addAtPos7(final Triplet<X0,X1,X2> tuple) {
        return addAtPos7(tuple.getValue0(),tuple.getValue1(),tuple.getValue2());
    }
    
    
    
    
    
    
    
    public <X0> Octet<A,B,C,D,E,F,G,X0> append(final X0 value0) {
        return addAtPos7(value0);
    }
    
    
    public <X0> Octet<A,B,C,D,E,F,G,X0> append(final Unit<X0> tuple) {
        return addAtPos7(tuple);
    }
    
    
    
    
    public <X0,X1> Ennead<A,B,C,D,E,F,G,X0,X1> append(final X0 value0, final X1 value1) {
        return addAtPos7(value0, value1);
    }
    
    
    public <X0,X1> Ennead<A,B,C,D,E,F,G,X0,X1> append(final Pair<X0,X1> tuple) {
        return addAtPos7(tuple);
    }
    
    
    
    
    public <X0,X1,X2> Decade<A,B,C,D,E,F,G,X0,X1,X2> append(final X0 value0, final X1 value1, final X2 value2) {
        return addAtPos7(value0, value1, value2);
    }
    
    
    public <X0,X1,X2> Decade<A,B,C,D,E,F,G,X0,X1,X2> append(final Triplet<X0,X1,X2> tuple) {
        return addAtPos7(tuple);
    }
    

    
    
    
    
    public <X> Septet<X,B,C,D,E,F,G> setAtPos0(final X value) {
        return new Septet<X,B,C,D,E,F,G>(
                value, this.val1, this.val2, this.val3, this.val4, this.val5, this.val6);
    }
    
    public <X> Septet<A,X,C,D,E,F,G> setAtPos1(final X value) {
        return new Septet<A,X,C,D,E,F,G>(
                this.val0, value, this.val2, this.val3, this.val4, this.val5, this.val6);
    }
    
    public <X> Septet<A,B,X,D,E,F,G> setAtPos2(final X value) {
        return new Septet<A,B,X,D,E,F,G>(
                this.val0, this.val1, value, this.val3, this.val4, this.val5, this.val6);
    }
    
    public <X> Septet<A,B,C,X,E,F,G> setAtPos3(final X value) {
        return new Septet<A,B,C,X,E,F,G>(
                this.val0, this.val1, this.val2, value, this.val4, this.val5, this.val6);
    }
    
    public <X> Septet<A,B,C,D,X,F,G> setAtPos4(final X value) {
        return new Septet<A,B,C,D,X,F,G>(
                this.val0, this.val1, this.val2, this.val3, value, this.val5, this.val6);
    }
    
    public <X> Septet<A,B,C,D,E,X,G> setAtPos5(final X value) {
        return new Septet<A,B,C,D,E,X,G>(
                this.val0, this.val1, this.val2, this.val3, this.val4, value, this.val6);
    }
    
    public <X> Septet<A,B,C,D,E,F,X> setAtPos6(final X value) {
        return new Septet<A,B,C,D,E,F,X>(
                this.val0, this.val1, this.val2, this.val3, this.val4, this.val5, value);
    }
    
    
}
