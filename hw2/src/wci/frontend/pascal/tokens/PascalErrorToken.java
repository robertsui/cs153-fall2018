package wci.frontend.pascal.tokens;

import wci.frontend.Source;
import wci.frontend.pascal.PascalErrorCode;
import wci.frontend.pascal.PascalToken;

import static wci.frontend.pascal.PascalTokenType.ERROR;

/**
 *
 *
 * <h1>PascalErrorToken</h1>
 *
 * <p>Pascal error token.
 *
 * <p>Copyright (c) 2009 by Ronald Mak
 *
 * <p>For instructional purposes only. No warranties.
 */
public class PascalErrorToken extends PascalToken {
  /**
   * Constructor.
   *
   * @param source the source from where to fetch subsequent characters.
   * @param errorCode the error code.
   * @param tokenText the text of the erroneous token.
   * @throws Exception if an error occurred.
   */
  public PascalErrorToken(Source source, PascalErrorCode errorCode, String tokenText)
      throws Exception {
    super(source);

    this.text = tokenText;
    this.type = ERROR;
    this.value = errorCode;
  }

  /**
   * Do nothing. Do not consume any source characters.
   *
   * @throws Exception if an error occurred.
   */
  protected void extract() throws Exception {}
}
