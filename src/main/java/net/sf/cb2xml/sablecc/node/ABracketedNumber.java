/* This file was generated by SableCC (http://www.sablecc.org/). */
package net.sf.cb2xml.sablecc.node;

import net.sf.cb2xml.sablecc.analysis.*;

import java.util.*;


public final class ABracketedNumber extends PBracketedNumber
{
    private TLparen _lparen_;
    private PNumber _number_;
    private TRparen _rparen_;

    public ABracketedNumber ()
    {
    }

    public ABracketedNumber (TLparen _lparen_, PNumber _number_,
        TRparen _rparen_)
    {
        setLparen (_lparen_);

        setNumber (_number_);

        setRparen (_rparen_);
    }

    public Object clone ()
    {
        return new ABracketedNumber((TLparen) cloneNode (_lparen_),
            (PNumber) cloneNode (_number_), (TRparen) cloneNode (_rparen_));
    }

    public void apply (Switch sw)
    {
        ((Analysis) sw).caseABracketedNumber (this);
    }

    public TLparen getLparen ()
    {
        return _lparen_;
    }

    public void setLparen (TLparen node)
    {
        if (_lparen_ != null)
        {
            _lparen_.parent (null);
        }

        if (node != null)
        {
            if (node.parent () != null)
            {
                node.parent ().removeChild (node);
            }

            node.parent (this);
        }

        _lparen_ = node;
    }

    public PNumber getNumber ()
    {
        return _number_;
    }

    public void setNumber (PNumber node)
    {
        if (_number_ != null)
        {
            _number_.parent (null);
        }

        if (node != null)
        {
            if (node.parent () != null)
            {
                node.parent ().removeChild (node);
            }

            node.parent (this);
        }

        _number_ = node;
    }

    public TRparen getRparen ()
    {
        return _rparen_;
    }

    public void setRparen (TRparen node)
    {
        if (_rparen_ != null)
        {
            _rparen_.parent (null);
        }

        if (node != null)
        {
            if (node.parent () != null)
            {
                node.parent ().removeChild (node);
            }

            node.parent (this);
        }

        _rparen_ = node;
    }

    public String toString ()
    {
        return "" + toString (_lparen_) + toString (_number_) +
        toString (_rparen_);
    }

    void removeChild (Node child)
    {
        if (_lparen_ == child)
        {
            _lparen_ = null;

            return;
        }

        if (_number_ == child)
        {
            _number_ = null;

            return;
        }

        if (_rparen_ == child)
        {
            _rparen_ = null;

            return;
        }
    }

    void replaceChild (Node oldChild, Node newChild)
    {
        if (_lparen_ == oldChild)
        {
            setLparen ((TLparen) newChild);

            return;
        }

        if (_number_ == oldChild)
        {
            setNumber ((PNumber) newChild);

            return;
        }

        if (_rparen_ == oldChild)
        {
            setRparen ((TRparen) newChild);

            return;
        }
    }
}
