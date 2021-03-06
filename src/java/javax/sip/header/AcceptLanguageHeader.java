/*
 @(#) src/java/javax/sip/header/AcceptLanguageHeader.java <p>
 
 Copyright &copy; 2008-2015  Monavacon Limited <a href="http://www.monavacon.com/">&lt;http://www.monavacon.com/&gt;</a>. <br>
 Copyright &copy; 2001-2008  OpenSS7 Corporation <a href="http://www.openss7.com/">&lt;http://www.openss7.com/&gt;</a>. <br>
 Copyright &copy; 1997-2001  Brian F. G. Bidulock <a href="mailto:bidulock@openss7.org">&lt;bidulock@openss7.org&gt;</a>. <p>
 
 All Rights Reserved. <p>
 
 This program is free software: you can redistribute it and/or modify it under
 the terms of the GNU Affero General Public License as published by the Free
 Software Foundation, version 3 of the license. <p>
 
 This program is distributed in the hope that it will be useful, but <b>WITHOUT
 ANY WARRANTY</b>; without even the implied warranty of <b>MERCHANTABILITY</b>
 or <b>FITNESS FOR A PARTICULAR PURPOSE</b>.  See the GNU Affero General Public
 License for more details. <p>
 
 You should have received a copy of the GNU Affero General Public License along
 with this program.  If not, see
 <a href="http://www.gnu.org/licenses/">&lt;http://www.gnu.org/licenses/&gt</a>,
 or write to the Free Software Foundation, Inc., 675 Mass Ave, Cambridge, MA
 02139, USA. <p>
 
 <em>U.S. GOVERNMENT RESTRICTED RIGHTS</em>.  If you are licensing this
 Software on behalf of the U.S. Government ("Government"), the following
 provisions apply to you.  If the Software is supplied by the Department of
 Defense ("DoD"), it is classified as "Commercial Computer Software" under
 paragraph 252.227-7014 of the DoD Supplement to the Federal Acquisition
 Regulations ("DFARS") (or any successor regulations) and the Government is
 acquiring only the license rights granted herein (the license rights
 customarily provided to non-Government users).  If the Software is supplied to
 any unit or agency of the Government other than DoD, it is classified as
 "Restricted Computer Software" and the Government's rights in the Software are
 defined in paragraph 52.227-19 of the Federal Acquisition Regulations ("FAR")
 (or any successor regulations) or, in the cases of NASA, in paragraph
 18.52.227-86 of the NASA Supplement to the FAR (or any successor regulations). <p>
 
 Commercial licensing and support of this software is available from OpenSS7
 Corporation at a fee.  See
 <a href="http://www.openss7.com/">http://www.openss7.com/</a>
 */

package javax.sip.header;

import javax.sip.*;

/**
    The Accept-Language header field is used in requests to indicate the preferred languages for
    reason phrases, session descriptions, or status responses carried as message bodies in the
    response. If no Accept-Language header field is present, the server SHOULD assume all languages
    are acceptable to the client. The q-value is used in a similar manner to AcceptHeader to
    indicate degrees of preference. <p> <dt>For Example:<br><code>Accept-Language: da, en-gb;q=0.8,
    en;q=0.7</code>
    @version 1.2.2
    @author Monavacon Limited
  */
public interface AcceptLanguageHeader extends Parameters, Header {
    /** Name of AcceptLanguageHeader.  */
    static final java.lang.String NAME = "Accept-Language";
    /**
        Gets q-value of the media-range in AcceptLanguageHeader. A value of -1 indicates theq-value
        is not set.
        @return q-value of media-range, -1 if q-value is not set.
      */
    public float getQValue();
    /**
        Sets q-value for media-range in AcceptLanguageHeader. Q-values allow the user to indicate
        the relative degree of preference for that media-range, using the qvalue scale from 0 to 1.
        If no q-value is present, the media-range should be treated as having a q-value of 1.
        @param qValue The new float value of the q-value, a value of -1 resets the qValue.
        @exception InvalidArgumentException Thrown when the q parameter value is not -1 or between 0
        and 1.
      */
    public void setQValue(float qValue) throws InvalidArgumentException;
    /**
        Gets the language value of the AcceptLanguageHeader.
        @return The language Locale value of this AcceptLanguageHeader.
      */
    public java.util.Locale getAcceptLanguage();
    /**
        Sets the language parameter of this AcceptLanguageHeader.
        @param language The new Locale value of the language of AcceptLanguageHeader.
      */
    public void setAcceptLanguage(java.util.Locale language);
}

// vim: sw=4 et tw=72 com=srO\:/**,mb\:*,ex\:*/,srO\:/*,mb\:*,ex\:*/,b\:TRANS,\://,b\:#,\:%,\:XCOMM,n\:>,fb\:-
