package org.minicastle.crypto.params;

import java.math.BigInteger;

import org.minicastle.crypto.CipherParameters;

public class ElGamalParameters
    implements CipherParameters
{
    private BigInteger              g;
    private BigInteger              p;

    public ElGamalParameters(
        BigInteger  p,
        BigInteger  g)
    {
        this.g = g;
        this.p = p;
    }

    public BigInteger getP()
    {
        return p;
    }

    /**
     * return the generator - g
     */
    public BigInteger getG()
    {
        return g;
    }

    public boolean equals(
        Object  obj)
    {
        if (!(obj instanceof ElGamalParameters))
        {
            return false;
        }

        ElGamalParameters    pm = (ElGamalParameters)obj;

        return pm.getP().equals(p) && pm.getG().equals(g);
    }
}
