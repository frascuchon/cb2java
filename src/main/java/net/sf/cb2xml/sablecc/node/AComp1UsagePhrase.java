/* This file was generated by SableCC (http://www.sablecc.org/). */
package net.sf.cb2xml.sablecc.node;

import net.sf.cb2xml.sablecc.analysis.*;

import java.util.*;


public final class AComp1UsagePhrase extends PUsagePhrase
{
    private TComp1 _comp1_;
    private TNative _native_;

    public AComp1UsagePhrase ()
    {
    }

    public AComp1UsagePhrase (TComp1 _comp1_, TNative _native_)
    {
        setComp1 (_comp1_);

        setNative (_native_);
    }

    public Object clone ()
    {
        return new AComp1UsagePhrase((TComp1) cloneNode (_comp1_),
            (TNative) cloneNode (_native_));
    }

    public void apply (Switch sw)
    {
        ((Analysis) sw).caseAComp1UsagePhrase (this);
    }

    public TComp1 getComp1 ()
    {
        return _comp1_;
    }

    public void setComp1 (TComp1 node)
    {
        if (_comp1_ != null)
        {
            _comp1_.parent (null);
        }

        if (node != null)
        {
            if (node.parent () != null)
            {
                node.parent ().removeChild (node);
            }

            node.parent (this);
        }

        _comp1_ = node;
    }

    public TNative getNative ()
    {
        return _native_;
    }

    public void setNative (TNative node)
    {
        if (_native_ != null)
        {
            _native_.parent (null);
        }

        if (node != null)
        {
            if (node.parent () != null)
            {
                node.parent ().removeChild (node);
            }

            node.parent (this);
        }

        _native_ = node;
    }

    public String toString ()
    {
        return "" + toString (_comp1_) + toString (_native_);
    }

    void removeChild (Node child)
    {
        if (_comp1_ == child)
        {
            _comp1_ = null;

            return;
        }

        if (_native_ == child)
        {
            _native_ = null;

            return;
        }
    }

    void replaceChild (Node oldChild, Node newChild)
    {
        if (_comp1_ == oldChild)
        {
            setComp1 ((TComp1) newChild);

            return;
        }

        if (_native_ == oldChild)
        {
            setNative ((TNative) newChild);

            return;
        }
    }
}
