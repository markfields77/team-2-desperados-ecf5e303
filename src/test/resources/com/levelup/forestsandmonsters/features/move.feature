Feature: Move in a direction 
    
    I want to move my character. If they attempt to 
    move past a boundary, the move results in no change in position but does increment move count.

    Scenario Outline: Move in a direction
        Given the character starts at position with XCoordinates <startingPositionX> 
        And starts at YCoordinates <startingPositionY>
        And the player choses to move in <direction>
        And the current move count is <startingMoveCount>
        When the character moves
        Then the character is now at position with XCoordinates <endingPositionX>
        And YCoordinates <endingPositionY>
        And the new move count is <endingMoveCount>
        Examples:
            | startingPositionX | startingPositionY | direction | startingMoveCount | endingPositionX | endingPositionY | endingMoveCount |
            | 5 | 5 | N | 0 | 5 | 4 | 1 |
            | 5 | 0 | N | 5 | 5 | 0 | 6 |
            | 9 | 9 | W | 3 | 8 | 9 | 4 |
            | 6 | 5 | S | 2 | 6 | 6 | 3 |
            | 8 | 4 | E | 7 | 9 | 4 | 8 |
            | 5 | 0 | S | 5 | 5 | 1 | 6 |
            | 5 | 0 | W | 3 | 4 | 0 | 4 |
            | 5 | 0 | E | 4 | 6 | 0 | 5 |
            | 0 | 0 | N | 205 | 0 | 0 | 206 |
            | 0 | 0 | S | 143 | 0 | 1 | 144 |
            | 0 | 0 | W | 62 | 0 | 0 | 63 |
            | 0 | 0 | E | 14 | 1 | 0 | 15 |
            | 0 | 9 | N | 20 | 0 | 8 | 21 | 
            | 0 | 9 | S | 30 | 0 | 9 | 31 |   
            | 0 | 9 | E | 40 | 1 | 9 | 41 |     
            | 0 | 9 | W | 50 | 0 | 9 | 51 |   
            | 9 | 0 | N | 60 | 9 | 0 | 61 |
            | 9 | 0 | S | 70 | 9 | 1 | 71 |
            | 9 | 0 | E | 90 | 9 | 0 | 91 |
            | 9 | 0 | W | 100 | 8 | 0 | 101 |
            | 5 | 9 | N | 110 | 5 | 8 | 111 |
            | 5 | 9 | S | 120 | 5 | 9 | 121 |
            | 5 | 9 | E | 130 | 6 | 9 | 131 |
            | 5 | 9 | W | 140 | 4 | 9 | 141 |
            | 9 | 5 | N | 150  | 9 | 4 | 151 |
            | 9 | 5 | S | 160 | 9 | 6 | 161 |
            | 9 | 5 | E | 170 | 9 | 5 | 171 |
            | 9 | 5 | W | 180 | 8 | 5 | 181 |
            | 5 | 5 | S | 190 | 5 | 6 | 191 |
            | 5 | 5 | E | 200 | 6 | 5 | 201 |
            | 5 | 5 | W | 210 | 4 | 5 | 211 |
            | 9 | 9 | N | 220 | 9 | 8 | 221 |
            | 9 | 9 | S | 230 | 9 | 9 | 231 |
            | 9 | 9 | E | 240 | 9 | 9 | 241 |