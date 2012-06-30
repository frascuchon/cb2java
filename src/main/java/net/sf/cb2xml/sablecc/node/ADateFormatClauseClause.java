/* This file was generated by SableCC (http://www.sablecc.org/). */
package net.sf.cb2xml.sablecc.node;

import net.sf.cb2xml.sablecc.analysis.*;

import java.util.*;


public final class ADateFormatClauseClause extends PClause
{
    private PDateFormatClause _dateFormatClause_;

    public ADateFormatClauseClause ()
    {
    }

    public ADateFormatClauseClause (PDateFormatClause _dateFormatClause_)
    {
        setDateFormatClause (_dateFormatClause_);
    }

    public Object clone ()
    {
        return new ADateFormatClauseClause((PDateFormatClause) cloneNode (
                _dateFormatClause_));
    }

    public void apply (Switch sw)
    {
        ((Analysis) sw).caseADateFormatClauseClause (this);
    }

    public PDateFormatClause getDateFormatClause ()
    {
        return _dateFormatClause_;
    }

    public void setDateFormatClause (PDateFormatClause node)
    {
        if (_dateFormatClause_ != null)
        {
            _dateFormatClause_.parent (null);
        }

        if (node != null)
        {
            if (node.parent () != null)
            {
                node.parent ().removeChild (node);
            }

            node.parent (this);
        }

        _dateFormatClause_ = node;
    }

    public String toString ()
    {
        return "" + toString (_dateFormatClause_);
    }

    void removeChild (Node child)
    {
        if (_dateFormatClause_ == child)
        {
            _dateFormatClause_ = null;

            return;
        }
    }

    void replaceChild (Node oldChild, Node newChild)
    {
        if (_dateFormatClause_ == oldChild)
        {
            setDateFormatClause ((PDateFormatClause) newChild);

            return;
        }
    }
}
