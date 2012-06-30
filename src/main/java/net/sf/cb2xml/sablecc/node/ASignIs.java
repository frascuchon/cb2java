/* This file was generated by SableCC (http://www.sablecc.org/). */
package net.sf.cb2xml.sablecc.node;

import net.sf.cb2xml.sablecc.analysis.*;

import java.util.*;


public final class ASignIs extends PSignIs
{
    private TSign _sign_;
    private TIs _is_;

    public ASignIs ()
    {
    }

    public ASignIs (TSign _sign_, TIs _is_)
    {
        setSign (_sign_);

        setIs (_is_);
    }

    public Object clone ()
    {
        return new ASignIs((TSign) cloneNode (_sign_), (TIs) cloneNode (_is_));
    }

    public void apply (Switch sw)
    {
        ((Analysis) sw).caseASignIs (this);
    }

    public TSign getSign ()
    {
        return _sign_;
    }

    public void setSign (TSign node)
    {
        if (_sign_ != null)
        {
            _sign_.parent (null);
        }

        if (node != null)
        {
            if (node.parent () != null)
            {
                node.parent ().removeChild (node);
            }

            node.parent (this);
        }

        _sign_ = node;
    }

    public TIs getIs ()
    {
        return _is_;
    }

    public void setIs (TIs node)
    {
        if (_is_ != null)
        {
            _is_.parent (null);
        }

        if (node != null)
        {
            if (node.parent () != null)
            {
                node.parent ().removeChild (node);
            }

            node.parent (this);
        }

        _is_ = node;
    }

    public String toString ()
    {
        return "" + toString (_sign_) + toString (_is_);
    }

    void removeChild (Node child)
    {
        if (_sign_ == child)
        {
            _sign_ = null;

            return;
        }

        if (_is_ == child)
        {
            _is_ = null;

            return;
        }
    }

    void replaceChild (Node oldChild, Node newChild)
    {
        if (_sign_ == oldChild)
        {
            setSign ((TSign) newChild);

            return;
        }

        if (_is_ == oldChild)
        {
            setIs ((TIs) newChild);

            return;
        }
    }
}
